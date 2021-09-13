package com.proxy.staticProxy;

public class SmsServiceImp implements SmsService{
    @Override
    public String send(String msg) {
        System.out.println("send msg:"+msg);
        return msg;
    }
}
