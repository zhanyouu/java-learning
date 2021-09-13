package com.designPatterns.chainOfResponsibilityPattern;

/**
 * @author: youzhan
 * @date: 2021/2/7
 * @link: youzhan@chinaums.com
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger) {
        this.nextLogger =abstractLogger;
    }

    public void logMessage(int level,String msg){
        if(this.level<=level){
            write(msg);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,msg);
        }
    }

    protected abstract void write(String msg);
}
