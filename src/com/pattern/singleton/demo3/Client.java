package com.pattern.singleton.demo3;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 判断两次获取到的Singleton对象是否是同一个对象
        System.out.println(instance1 == instance2);
    }
}
