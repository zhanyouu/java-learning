package com.proxy.cglibDynamicProxy;

public class SmsService2 {
    public String send(String msg) {
        System.out.println("send msg:"+msg);
        return msg;
    }
}
