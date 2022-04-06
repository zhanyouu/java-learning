package com.pattern.singleton.demo3;

/**
 * @Description: 懒汉式: 线程不安全
 */
public class Singleton {
    // 声明Singleton类型的变量instance, 没有赋值
    private static Singleton instance;

    // 私有构造方法
    private Singleton() {
    }

    // 对外提供访问方式
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
