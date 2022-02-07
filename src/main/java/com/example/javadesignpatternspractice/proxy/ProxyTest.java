package com.example.javadesignpatternspractice.proxy;

import com.example.javadesignpatternspractice.proxy.cglibproxy.CglibInterceptor;
import com.example.javadesignpatternspractice.proxy.cglibproxy.CglibUser;
import com.example.javadesignpatternspractice.proxy.jdkproxy.IJDKUser;
import com.example.javadesignpatternspractice.proxy.jdkproxy.JDKUser;
import com.example.javadesignpatternspractice.proxy.jdkproxy.JDKUserProxy;
import com.example.javadesignpatternspractice.proxy.staticproxy.IUser;
import com.example.javadesignpatternspractice.proxy.staticproxy.User;
import com.example.javadesignpatternspractice.proxy.staticproxy.UserProxy;

public class ProxyTest {

    public static void main(String[] args) {
         //静态代理
         staticProxy();
         //jdk 动态代理
         jdkDynamicProxy();
         //cglib 动态代理
         cglibDynamicProxy();
    }

    /**
     * 静态代理测试方法
     */
    public static void staticProxy() {
        IUser user = new User();
        UserProxy proxy = new UserProxy(user);
        proxy.say();
    }

    /**
     * JDK动态代理测试方法
     */
    public static void  jdkDynamicProxy() {
        IJDKUser user = new JDKUser();
        JDKUserProxy jdkUserProxy = new JDKUserProxy(user);
        IJDKUser jdkUser = (IJDKUser) jdkUserProxy.getProxy();
        jdkUser.say();
    }

    /**
     * cglib动态代理测试方法
     */
    public static void  cglibDynamicProxy() {
        CglibUser cglibUser = new CglibUser();
        CglibInterceptor cglibInterceptor = new CglibInterceptor(cglibUser);
        CglibUser proxy = (CglibUser) cglibInterceptor.getProxy();
        proxy.say();
    }
}
