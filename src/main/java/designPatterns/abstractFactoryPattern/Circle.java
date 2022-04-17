package designPatterns.abstractFactoryPattern;

/**
 * @auther heer
 * @create 2022/4/13
 */

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}