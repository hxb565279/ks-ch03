package com.hxb.aspect;
//切面类,多个通知Advice
public class MyAspect {
    public void check_Permissions(){
        System.out.println("模拟检查权限");
    }
    public void log(){
        System.out.println("模拟记录日志");
    }
}
