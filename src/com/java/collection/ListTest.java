package com.java.collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {
    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            list.add("3");
        }
    }
}
/**
 * 安全失败（fail-safe）
 * CopyOnWriteArrayList方法每次调用add(),内部都会重新生成一个数组。
 * 由于在获取iterator()方法时，迭代器的对象已经确定，因此后续add()操作对此迭代器不可见
 */
