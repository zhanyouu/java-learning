package com.proxy.staticProxy;

public class SmsProxy implements SmsService {
    private final SmsService smsService;
    public SmsProxy(SmsService smsService){
        this.smsService = smsService;
    }
    @Override
    public String send(String msg) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method send()");
        smsService.send(msg);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method send()");
        return null;
    }
}
