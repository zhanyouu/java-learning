package com.pattern.prototype.deep;

import java.io.Serializable;

/**
 * 学生类
 */
public class Student implements Serializable {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(String name) {
        this.name = name;
    }
}
