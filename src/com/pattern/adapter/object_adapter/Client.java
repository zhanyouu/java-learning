package com.pattern.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 电脑读取SD卡中的数据(可直接读)
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("===============");
        // 使用电脑读取TF卡中的数据(无法直接读)
        // 创建适配器类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
