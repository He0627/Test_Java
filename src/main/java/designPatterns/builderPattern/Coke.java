package designPatterns.builderPattern;

/**
 * @auther heer
 * @create 2022/4/14
 */
public class Coke extends ColdDrink {

    @Override
    public float price(){
        return 30.0f;
    }

    @Override
    public String name(){
        return "Coke";
    }
}
