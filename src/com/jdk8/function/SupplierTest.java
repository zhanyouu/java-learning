package com.jdk8.function;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        boolean flag = true;
        int res = getSupplier(()-> {
            if(flag){
                return 0;
            }
            return 1;
        });
        System.out.println(res);
    }
    public static int getSupplier(Supplier<Integer> supplier){
        return supplier.get();
    }
}
