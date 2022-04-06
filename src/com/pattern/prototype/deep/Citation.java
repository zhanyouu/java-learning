package com.pattern.prototype.deep;

import java.io.*;

/**
 * 奖状类
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    // 1 所有对象都实现序列化的接口
    // 2 自定义一个深度克隆方法deepClone, 通过文件流和对象流的方式实现对象的深度拷贝
    public Citation deepClone() throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));) {
            oos.writeObject(this);
            Citation citation = (Citation) ois.readObject();
            return citation;
        }
    }

    // 1 所有对象都实现序列化的接口
    // 2 自定义一个深度克隆方法deepClone, 通过字节数组流和对象流的方式实现对象的深度拷贝
    public Citation deepClone2() throws Exception {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Citation) ois.readObject();
        }
    }
}