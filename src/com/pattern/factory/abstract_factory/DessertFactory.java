package com.pattern.factory.abstract_factory;

/**
 * 甜品工厂
 */
public interface DessertFactory {
    // 生产咖啡的功能
    Coffee createCoffee();
    // 生产甜品的功能
    Dessert createDessert();
}
