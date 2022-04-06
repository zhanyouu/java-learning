package com.pattern.factory.abstract_factory;

/**
 * 意大利风味甜品工厂
 * 生产拿铁咖啡和提拉米苏甜品
 */
public class ItalyDessertFactory implements DessertFactory {
    // 生产拿铁咖啡
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
    // 生产提拉米苏
    public Dessert createDessert() {
        return new Trimisu();
    }
}
