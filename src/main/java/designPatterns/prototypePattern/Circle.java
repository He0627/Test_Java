package designPatterns.prototypePattern;

/**
 * @auther heer
 * @create 2022/4/15
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
