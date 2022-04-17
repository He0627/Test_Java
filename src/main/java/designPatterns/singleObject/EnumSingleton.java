package designPatterns.singleObject;

/**
 * @auther heer
 * @create 2022/4/14
 */
/*通过枚举创建单例模式*/
public enum EnumSingleton {
    INSTACNE;
    public EnumSingleton getInstacne(){
        return INSTACNE;
    }
}
