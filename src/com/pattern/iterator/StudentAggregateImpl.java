package com.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list = new ArrayList<>();

    public void addStudent(Student stu) {
        list.add(stu);
    }

    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    // 获取迭代器对象
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
