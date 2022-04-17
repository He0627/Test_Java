package designPatterns.abstractFactoryPattern;

/**
 * @auther heer
 * @create 2022/4/13
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQURE");
        shape3.draw();

        AbstractFactory colotFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colotFactory.getColor("RED");
        color1.fill();

        Color color2 = colotFactory.getColor("BLUE");
        color2.fill();
    }
}
