package com.pattern.prototype.deep;

public class CitationTest {
    public static void main(String[] args) throws Exception {
        // 原型对象
        Citation c1 = new Citation();
        Student stu1 = new Student("张三");
        c1.setStu(stu1);

        // 复制奖状并修改名字
        Citation c2 = c1.deepClone2();
        Student stu2 = c2.getStu();
        stu2.setName("李四");

        // 判断stu1对象和stu2对象是否是同一个对象
        System.out.println("st1和stu2是否同一个对象？" + (stu1 == stu2));

        c1.show();
        c2.show();
    }
}