package com.hxb.jdk;

import com.hxb.aspect.MyAspect;

public class JdkText {
    public static void main(String[] args) {
        //创建代理对象
        JdkProxy jdkProxy = new JdkProxy();
        //目标类
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
