package com.example.demo.BehaviouralDesignPattern.ChainOfResponsibility;

public class ChainPatternDemo {
    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(ErrorLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLoggers();
        logger.logMessage(AbstractLogger.INFO,"This is info");
        logger.logMessage(AbstractLogger.DEBUG,"This is debug");
        logger.logMessage(AbstractLogger.ERROR,"This is error");
    }
}
