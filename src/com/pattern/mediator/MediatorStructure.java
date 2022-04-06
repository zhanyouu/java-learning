package com.pattern.mediator;

import lombok.Data;

/**
 * 具体的中介者角色类
 */
@Data
public class MediatorStructure extends Mediator {
    // 聚合房主和房客对象
    private HouseOwner houseOwner;
    private Tenant tenant;

    public void contact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
