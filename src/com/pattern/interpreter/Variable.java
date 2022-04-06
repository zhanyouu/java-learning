package com.pattern.interpreter;

import lombok.AllArgsConstructor;

/**
 * 封装变量的类
 */
@AllArgsConstructor
public class Variable extends AbstractExpression {
    // 声明存储变量名的成员变量
    private String name;

    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
