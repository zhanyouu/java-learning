package com.pattern.iterator;

import java.util.List;

/**
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {
    private final List<Student> list;
    private int position = 0; // 记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return position < list.size();
    }

    public Student next() {
        // 从集合中获取指定位置的元素
        return list.get(position++);
    }
}
