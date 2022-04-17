package designPatterns.observerPattern;

/**
 * @auther heer
 * @create 2022/4/16
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
