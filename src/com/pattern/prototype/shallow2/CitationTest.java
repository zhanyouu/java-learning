package com.pattern.prototype.shallow2;

/**
 * 测试类
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        Student stu1 = new Student("张三", "西安");
        c1.setStu(stu1);
        // 复制奖状
        Citation c2 = c1.clone();
        // 获取c2奖状所属学生对象
        Student stu2 = c2.getStu();
        stu2.setName("李四");

        // 判断stu1对象和stu2对象是否是同一个对象
        System.out.println("st1和stu2是否同一个对象？" + (stu1 == stu2));

        c1.show();
        c2.show();
    }
}
