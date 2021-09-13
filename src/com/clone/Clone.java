package com.clone;

public class Clone {
    public static void main(String[] args) {
        try {
            Student student1 = new Student();
            Teacher teacher = new Teacher();
            student1.setName("s1");
            teacher.setName("t1");
            student1.setTeacher(teacher);
            Student student2 = (Student) student1.clone();
            student2.setName("s2");
            student2.getTeacher().setName("t2");
            System.out.println("student1-name:"+student1.getName());
            System.out.println("student1-teacher-name:"+student1.getTeacher().getName());
            System.out.println("student2-name:"+student2.getName());
            System.out.println("student2--teacher-name:"+student2.getTeacher().getName());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/**
 * Java 中的数据类型分为基本数据类型和引用数据类型。对于这两种数据类型，在进行赋值操作、
 * 用作方法参数或返回值时，会有值传递和引用（地址）传递的差别。
 * 浅拷贝：(1) 对于基本数据类型的成员对象，因为基础数据类型是值传递的，所以是直接将属性值赋值给新的对象。基础类型的拷贝，其中一个对象修改该值，不会影响另外一个。
 * (2) 对于引用类型，比如数组或者类对象，因为引用类型是引用传递，所以浅拷贝只是把内存地址赋值给了成员变量，它们指向了同一内存空间。改变其中一个，会对另外一个也产生影响。
 * 深拷贝：在拷贝引用类型成员变量时，为引用类型的数据成员另辟了一个独立的内存空间，实现真正内容上的拷贝。(1) 对于基本数据类型的成员对象，因为基础数据类型是值传递的，所以是直接将属性值赋值给新的对象。基础类型的拷贝，其中一个对象修改该值，不会影响另外一个（和浅拷贝一样）。
 * (2) 对于引用类型，比如数组或者类对象，深拷贝会新建一个对象空间，然后拷贝里面的内容，所以它们指向了不同的内存空间。改变其中一个，不会对另外一个也产生影响。
 * (3) 对于有多层对象的，每个对象都需要实现 Cloneable 并重写 clone() 方法，进而实现了对象的串行层层拷贝。

 */