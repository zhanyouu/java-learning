package com.pattern.factory.factory_method;

/**
 * 美式咖啡工厂，专门用来生产美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}