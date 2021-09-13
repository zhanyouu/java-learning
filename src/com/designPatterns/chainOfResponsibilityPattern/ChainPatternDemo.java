package com.designPatterns.chainOfResponsibilityPattern;

/**
 * @author: youzhan
 * @date: 2021/2/7
 * @link: youzhan@chinaums.com
 */
public class ChainPatternDemo {
    public AbstractLogger getLoggerChain(){
        ConsoleLogger consoleLogger =new ConsoleLogger(AbstractLogger.INFO);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ErrorLogger errorLogger =new ErrorLogger(AbstractLogger.ERROR);
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
        return consoleLogger;
    }
    public static void main(String[] args) {
        AbstractLogger abstractLogger = new ChainPatternDemo().getLoggerChain();
        abstractLogger.logMessage(1,"this is info msg");
        abstractLogger.logMessage(2,"this is file msg");
        abstractLogger.logMessage(3,"this is error msg");
    }
}
