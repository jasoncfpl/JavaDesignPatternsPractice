package com.example.javadesignpatternspractice.proxy.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 静态代理类-代理角色
 */
public class JDKUserProxy implements InvocationHandler {
    //被代理的类
    private IJDKUser target;

    public JDKUserProxy(IJDKUser target) {
        this.target = target;
    }

    //获取代理对象-动态生成
    public Object getProxy() {
        return Proxy.newProxyInstance(getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----JDK动态代理方法开始----");
        Object object = method.invoke(target,args);
        System.out.println("----JDK动态代理方法结束----");
        return object;
    }
}
