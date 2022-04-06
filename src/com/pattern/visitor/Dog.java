package com.pattern.visitor;

/**
 * 具体元素角色类（宠物狗）
 */
public class Dog implements Animal {
    public void accept(Person person) {
        person.feed(this); // 访问者给宠物狗喂食
        System.out.println("好好吃，汪汪汪。。。");
    }
}