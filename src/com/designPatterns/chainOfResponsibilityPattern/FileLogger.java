package com.designPatterns.chainOfResponsibilityPattern;

/**
 * @author: youzhan
 * @date: 2021/2/7
 * @link: youzhan@chinaums.com
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("File logger:"+msg);
    }
}
