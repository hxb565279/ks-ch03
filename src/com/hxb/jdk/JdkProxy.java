package com.hxb.jdk;

import com.hxb.aspect.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk代理类
 */

public class JdkProxy implements InvocationHandler {
    //声明目标接口
   private UserDao userDao;
   public Object createProxy(UserDao userDao){
       this.userDao = userDao;
       //类加载器
      ClassLoader classLoader = JdkProxy.class.getClassLoader();
      //被代理类的所有对象实现接口
       Class [] classz = userDao.getClass().getInterfaces();
       return Proxy.newProxyInstance(classLoader,classz,this);

   }

    /**
     * 所有动态代理类的方法调用,都会交由invoke处理
     *
     * @param proxy  被代理的对象
     * @param method  将要被执行的方法信息
     * @param args  执行方法需要的参数
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      //声明切面
        MyAspect myAspect = new MyAspect();
      //前增强
        myAspect.check_Permissions();
      //目标类调用方法,传入参数
        Object obj = method.invoke(userDao,args);
       //后增强
        myAspect.log();

        return obj;
    }
}
