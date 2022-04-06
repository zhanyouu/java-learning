package com.pattern.singleton.demo4;

/**
 * 双重检查锁方式
 */
public class Singleton {
    // 声明Singleton类型的变量
    private static Singleton instance;

    // 私有构造方法
    private Singleton() {
    }

    // 对外提供公共的访问方式
    public static Singleton getInstance() {
        // 第一次判断,如果instance不为null,不需要抢占锁,直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断,抢占到锁以后再次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
