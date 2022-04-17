package designPatterns.builderPattern;

/**
 * @auther heer
 * @create 2022/4/14
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
