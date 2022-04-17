package designPatterns.abstractFactoryPattern;

/**
 * @auther heer
 * @create 2022/4/13
 */
public class Red implements Color{
    @Override
    public void fill(){
        System.out.println("Inside Green::fill() method.");
    }
}
