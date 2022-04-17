package designPatterns.singleObject;

/**
 * @auther heer
 * @create 2022/4/14
 */

/*懒汉式，线程不安全*/
public class UnSafeSingleton {
    private static UnSafeSingleton instance;
    private UnSafeSingleton(){};

    public static UnSafeSingleton getInstance(){
        if (instance == null){
            instance = new UnSafeSingleton();
        }
        return instance;
    }
}
