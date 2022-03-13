package com.jdk8.function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String res = getFunction((a)->{
            return a.toString();
        },1);
        System.out.println(res);
    }
    public static String getFunction(Function<Integer,String> function,Integer a){
        return function.apply(a);
    }
}
