package designPatterns.builderPattern;

/**
 * @auther heer
 * @create 2022/4/14
 */
/*创建实现 Packing 接口的实体类。*/
public class Wrapper implements Packing{
    @Override
    public String pack(){
        return "Wrapper";
    }
}
