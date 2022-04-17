package designPatterns.abstractFactoryPattern;

/**
 * @auther heer
 * @create 2022/4/13
 */

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
