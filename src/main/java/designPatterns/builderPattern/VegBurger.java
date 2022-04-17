package designPatterns.builderPattern;

/**
 * @auther heer
 * @create 2022/4/14
 */
/*创建扩展了 Burger 和 ColdDrink 的实体类。*/
public class VegBurger extends Burger{

    @Override
    public float price(){
        return 25.0f;
    }

    @Override
    public String name(){
        return "Veg Burger";
    }
}
