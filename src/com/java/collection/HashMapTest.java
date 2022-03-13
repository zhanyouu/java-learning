package com.java.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        Iterator iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
            map.put("3","3");//Exception in thread "main" java.util.ConcurrentModificationException
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1", "1");
        concurrentHashMap.put("2", "2");
        Iterator iterator = concurrentHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            concurrentHashMap.put("下次循环正常执行","3");
        }
        System.out.println(concurrentHashMap.size());
    }
}
/**
 *快速失败（fail-fast）:
 * 在使用迭代器对集合对象进行遍历的时候，如果 A 线程正在对集合进行遍历，此时 B 线程对集合进行修改（增加、删除、修改），或者 A 线程在遍历过程中对集合进行修改，都会导致 A 线程抛出 ConcurrentModificationException 异常。
 *原因：原因是迭代器在遍历时直接访问集合中的内容，并且在遍历过程中使用一个modCount变量。集合在被遍历期间如果内容发生变化，就会改变modCount的值。
 * 每当迭代器使用 hashNext()/next() 遍历下一个元素之前，都会检测modCount变量是否为 expectedModCount 值，是的话就返回遍历；否则抛出异常，终止遍历。
 *

 *
 *  安全失败（fail-safe）
 *
 * 采用安全失败机制的集合容器，在遍历时不是直接在集合内容上访问的，而是先复制原有集合内容，在拷贝的集合上进行遍历。
 * 由于迭代时是对原集合的拷贝进行遍历，所以在遍历过程中对原集合所作的修改并不能被迭代器检测到，故不会抛 ConcurrentModificationException 异常
 * 注意：ConcurrentHashMap里面迭代器使用的对象是当前对象（同一个对象），concurrentHashMap.put（）方法修改操作能被迭代器检测到。
 * 但是不一定能迭代出来（和插入的位置相关，有可能插入的位置已经迭代过了，有可能接下来才迭代），即针对上述方法concurrentHashMap.put("下次循环正常执行","3");
 * 不同的值，运行结果可能会有差异。
 */