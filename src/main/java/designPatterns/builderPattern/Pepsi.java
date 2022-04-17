package designPatterns.builderPattern;

/**
 * @auther heer
 * @create 2022/4/14
 */
public class Pepsi extends ColdDrink{

    @Override
    public float price(){
        return 35.0f;
    }

    @Override
    public String name(){
        return "Pepsi";
    }
}
