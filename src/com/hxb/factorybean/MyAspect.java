package com.hxb.factorybean;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_Permissions();
        //执行目标方法
        Object obj = methodInvocation.proceed();
        log();
        return obj;
    }
    public void check_Permissions(){
        System.out.println("模拟检查日志");
    }
    public void log(){
        System.out.println("模拟记录日志");
    }
}
