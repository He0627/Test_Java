package designPatterns.chainofResponsibilityPattern;

/**
 * @auther heer
 * @create 2022/4/16
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.LogMessage(AbstractLogger.INFO, "This is an information");

        loggerChain.LogMessage(AbstractLogger.DEBUG, "This is a debug level information");

        loggerChain.LogMessage(AbstractLogger.ERROR, "This is a error information");

    }
}
