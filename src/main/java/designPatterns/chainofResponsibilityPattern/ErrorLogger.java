package designPatterns.chainofResponsibilityPattern;

/**
 * @auther heer
 * @create 2022/4/16
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Error Console::Logger: " + message);
    }
}
