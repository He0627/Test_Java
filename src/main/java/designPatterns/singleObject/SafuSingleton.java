package designPatterns.singleObject;

/**
 * @auther heer
 * @create 2022/4/14
 */

/*懒汉式，线程安全*/
public class SafuSingleton {
    private static SafuSingleton instance;
    private SafuSingleton(){};

    private static synchronized SafuSingleton getInstance(){
        if (instance == null){
            instance = new SafuSingleton();
        }
        return instance;
    }
}
