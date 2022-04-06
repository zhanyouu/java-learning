package com.pattern.singleton.demo8;

/**
 * 静态内部类方式(解决反射破坏单例模式)
 */
public class Singleton {
    private static boolean flag = false;

    // 私有构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            // 如果是true,说明非第一次访问,直接抛一个异常,如果是false,说明第一次访问
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    //提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }
}
