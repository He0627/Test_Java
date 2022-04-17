package designPatterns.singleObject;

/**
 * @auther heer
 * @create 2022/4/14
 */

/*饿汉式*/
    /*常用，没有锁，效率高，类加载时就初始化，容易产生垃圾对象，浪费内存*/
public class HunSingleton {
    private static HunSingleton instance = new HunSingleton();
    private HunSingleton(){};
    public static HunSingleton getInstance(){
        return instance;
    }
}
