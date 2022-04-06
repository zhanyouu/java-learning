package com.pattern.adapter.object_adapter;

/**
 * 计算机类
 */
public class Computer {
    // 从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card can not be null");
        }
        return sdCard.readSD();
    }
}
