package com.pattern.factory.abstract_factory;

/**
 * 咖啡抽象类
 */
public abstract class Coffee {
    public abstract String getName();
    // 加糖
    public void addsugar() {
        System.out.println("加糖");
    }
    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
