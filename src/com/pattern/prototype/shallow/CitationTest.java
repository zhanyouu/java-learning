package com.pattern.prototype.shallow;

/**
 * 测出访问类
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");

        // 复制奖状
        Citation c2 = c1.clone();
        c2.setName("李四"); // 将奖状的名字改为李四

        c1.show();
        c2.show();
    }
}