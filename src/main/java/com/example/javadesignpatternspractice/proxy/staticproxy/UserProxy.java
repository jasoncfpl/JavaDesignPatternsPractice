package com.example.javadesignpatternspractice.proxy.staticproxy;

/**
 * 静态代理类-代理角色
 */
public class UserProxy implements IUser {
    //被代理的类
    private IUser target;

    public UserProxy(IUser target) {
        this.target = target;
    }

    @Override
    public void say() {
        System.out.println("----静态代理方法开始----");
        target.say();
        System.out.println("----静态代理方法接口----");
    }
}
