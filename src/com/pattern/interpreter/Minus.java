package com.pattern.interpreter;

import lombok.AllArgsConstructor;

/**
 * 减法表达式类
 */
@AllArgsConstructor
public class Minus extends AbstractExpression {
    // -号左边的表达式
    private AbstractExpression left;
    // -号右边的表达式
    private AbstractExpression right;
    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果进行相减
        return left.interpret(context) - right.interpret(context);
    }
    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
