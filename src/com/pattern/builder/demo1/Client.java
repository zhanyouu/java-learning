package com.pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        // 创建指挥者对象
        Director director = new Director(new MobileBuilder());
        // 指挥者进行指挥,组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
