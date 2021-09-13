package com.proxy.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;


public class MainTest {
    public static void main(String[] args) {
        SmsInterceptorHandler smsInterceptorHandler = new SmsInterceptorHandler(new SmsService2());
        SmsService2 service = (SmsService2) Enhancer.create(SmsService2.class,smsInterceptorHandler);
        service.send("java");
    }
    /**
     * cglib和jdk动态代理的区别
     * jdk动态代理，需要有接口，目标类需要实现该接口；cglib动态代理，不需要接口，直接对类进行代理
     */

}
