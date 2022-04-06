package com.pattern.facade;

public class Client {
    public static void main(String[] args) {
        // 创建智能音箱对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        // 控制家电
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}
