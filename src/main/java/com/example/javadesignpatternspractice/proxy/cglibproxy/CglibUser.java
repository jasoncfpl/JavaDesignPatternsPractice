package com.example.javadesignpatternspractice.proxy.cglibproxy;


/**
 * 将要被代理的类-目标角色
 */
public class CglibUser {
    public void say() {
        System.out.println("CglibUser say :  cglib 动态代理");
    }
}
