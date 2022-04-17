package designPatterns.builderPattern;

/**
 * @auther heer
 * @create 2022/4/14
 */
public class ChickenBurger extends Burger{

    @Override
    public float price(){
        return 50.0f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }
}
