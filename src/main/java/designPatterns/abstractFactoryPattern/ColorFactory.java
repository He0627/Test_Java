package designPatterns.abstractFactoryPattern;

/**
 * @auther heer
 * @create 2022/4/13
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeTypr){
        return null;
    }

    @Override
    public Color getColor(String colorType){
        if (colorType == null){
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
