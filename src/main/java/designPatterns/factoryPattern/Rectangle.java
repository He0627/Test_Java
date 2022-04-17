package designPatterns.factoryPattern;

/**
 * @auther heer
 * @create 2022/4/13
 */
public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
