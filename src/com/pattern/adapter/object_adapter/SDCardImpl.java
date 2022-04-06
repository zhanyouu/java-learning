package com.pattern.adapter.object_adapter;

/**
 * 具体的SD卡
 */
public class SDCardImpl implements SDCard {
    public String readSD() {
        String msg = "SDCard read msg: hello word SDCard";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}
