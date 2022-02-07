package com.example.javadesignpatternspractice.proxy.staticproxy;

/**
 * 将要被代理的类-目标角色
 */
public class User implements IUser{
    @Override
    public void say() {
        System.out.println("User say : 静态代理");
    }
}
