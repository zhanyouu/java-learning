package com.designPatterns.chainOfResponsibilityPattern;

/**
 * @author: youzhan
 * @date: 2021/2/7
 * @link: youzhan@chinaums.com
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Console logger:"+msg);
    }
}
