package com.hxb.aspectj.annotation;

import com.hxb.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestANNOTATION {
    public static void main(String[] args) {
        String xmlPath =
                "com/hxb/aspectj/annotation/applicationContext.xml";
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(xmlPath);
        // 1 从spring容器获得内容
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        // 2 执行方法
        userDao.addUser();
    }
}
