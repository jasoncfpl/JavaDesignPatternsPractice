package com.example.javadesignpatternspractice.proxy.jdkproxy;


/**
 * 将要被代理的类-目标角色
 */
public class JDKUser implements IJDKUser {
    @Override
    public void say() {
        System.out.println("JDKUser say :  JDK动态代理");
    }
}
