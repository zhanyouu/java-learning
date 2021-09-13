package com.proxy.staticProxy;

public class MainTest {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImp();
        SmsProxy proxy = new SmsProxy(smsService);
        proxy.send("java");
    }
}
