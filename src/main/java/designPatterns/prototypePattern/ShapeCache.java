package designPatterns.prototypePattern;

import java.util.Hashtable;

/**
 * @auther heer
 * @create 2022/4/15
 */

/*创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中。*/
public class ShapeCache {

    //维护一个注册表
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){//提供一个获取新实例的方法
        Shape cachedShape = shapeMap.get(shapeId);//提供一个找出正确实例原型的方法
        return (Shape) cachedShape.clone();//委托复制实例的方法生成新实例。
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
