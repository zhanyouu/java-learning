package com.jdk8.lambda;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Java8Tester2 {
    public static void main(String args[]){

        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");

        Java8Tester2 tester = new Java8Tester2();
        System.out.println("使用 Java 7 语法: ");

        tester.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("使用 Java 8 语法: ");

        tester.sortUsingJava8(names2);
        System.out.println(names2);
    }

    // 使用 java 7 排序
    private void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    // 使用 java 8 排序
    private void sortUsingJava8(List<String> names){
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
/**
 * Comparator标注的@FunctionalInterface 函数试接口，可以使用λ表达式；
 * 疑问？Comparator中有两个空方法；
 * 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
 * 注意：任何重写了超类Object类中任意一个public方法的方法并不算接口中的抽象方法.Comparator中boolean equals(Object obj) 方法不是抽象方法。
 */