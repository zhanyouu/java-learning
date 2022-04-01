package com.jdk8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8Test3 {
    public static void main(String[] args) {
        /**
         * 对象::实例方法，将 lambda 的参数当做方法的参数使用
         */
        Consumer<String> sc = System.out::println;
        Consumer<String> sc2 = (x)->System.out.println(x);
        sc.accept("对象::实例方法");
        /**
         * 类::静态方法，将lambda的参数当做方法的参数使用
         */
        Function<Integer,String> sf= String::valueOf;
        Function<Integer, String> sf2 = (x) -> String.valueOf(x);
        String apply1 = sf.apply(61888);
        System.out.println(apply1);
        /**
         *  类::实例方法，将lambda的第一个参数当做方法的调用者，其他的参数作为方法的参数。开发中尽量少些此类写法，减少后续维护成本。
         */
        BiPredicate<String, String> sbp = String::equals;
//等效
        BiPredicate<String, String> sbp2 = (x, y) -> x.equals(y);
        boolean test = sbp.test("a", "A");
        System.out.println(test);
    }
}
