package com.pattern.factory.simple_factory;

/**
 * 咖啡店
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 生产咖啡的简单工厂
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
