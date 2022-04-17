package designPatterns.chainofResponsibilityPattern;

/**
 * @auther heer
 * @create 2022/4/16
 */

/*创建扩展了该记录器类的实体类。*/
public class ConsoleLogger extends AbstractLogger{

    //设置 nextLogger 时，在初始化时就指定。
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Standard Console::Logger: " + message);
    }
}
