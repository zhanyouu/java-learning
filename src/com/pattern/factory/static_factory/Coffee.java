package com.pattern.factory.static_factory;

/**
 * 咖啡类
 */
public abstract class Coffee {
    // 获取咖啡名称
    public abstract String getName();
    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }
    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}