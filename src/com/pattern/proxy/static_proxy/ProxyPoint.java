package com.pattern.proxy.static_proxy;

/**
 * 代售点类
 */
public class ProxyPoint implements SellTickets {
    // 火车站类对象
    private TrainStation trainStation  = new TrainStation();
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
