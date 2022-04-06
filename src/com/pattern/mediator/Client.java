package com.pattern.mediator;

public class Client {
    public static void main(String[] args) {
        // 中介者对象
        MediatorStructure mediator = new MediatorStructure();
        // 租房者对象
        Tenant tenant = new Tenant("李四", mediator);
        // 房主对象
        HouseOwner houseOwner = new HouseOwner("张三", mediator);

        // 中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.contact("我要租三室的房子！！！");
        houseOwner.contact("我这里有三室的房子，你要租吗？");
    }
}
