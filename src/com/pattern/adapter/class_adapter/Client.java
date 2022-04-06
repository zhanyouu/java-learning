package com.pattern.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 电脑读取SD卡中的数据(可直接读)
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("===============");
        // 使用电脑读取TF卡中的数据(无法直接读)
        // 定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
