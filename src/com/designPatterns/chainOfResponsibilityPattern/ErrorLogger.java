package com.designPatterns.chainOfResponsibilityPattern;

/**
 * @author: youzhan
 * @date: 2021/2/7
 * @link: youzhan@chinaums.com
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Error logger:"+msg);
    }
}
