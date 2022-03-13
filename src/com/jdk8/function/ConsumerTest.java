package com.jdk8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        getConsumer((str)-> {
            if("a".equals(str)){
                list.add(str);
                System.out.println(str);
            }
        },"a");
        System.out.println(list);
    }
    public static void getConsumer(Consumer<String> consumer,String a){
        consumer.accept(a);
    }
}
