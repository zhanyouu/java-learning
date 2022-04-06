package com.pattern.builder.demo1;

/**
 * 抽象建造者类
 */
public abstract class Builder {
    protected Bike bike = new Bike();
    // 构建车架
    public abstract void buildFrame();
    // 构建车座
    public abstract void buildSeat();
    // 构建自行车
    public abstract Bike createBike();
}
