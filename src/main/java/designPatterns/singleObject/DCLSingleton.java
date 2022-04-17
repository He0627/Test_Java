package designPatterns.singleObject;

/**
 * @auther heer
 * @create 2022/4/14
 */

/*双检锁/双重校验锁*/
    /*这种方式采用双锁机制，安全且在多线程情况下能保持高性能。*/
public class DCLSingleton {
    private volatile static DCLSingleton singleton;
    private DCLSingleton(){};
    public static DCLSingleton getInstance(){
        if (singleton == null){
            // 判断对象是否以及实例化过，没有则进入加锁代码块，此处可能有多个线程同时进来，等待类对象锁
            synchronized (DCLSingleton.class){
                // 获取类对象锁，其他线程在外等待，其他线程进来再次判断，如果对象实例化了，则不需要再实例化
                if (singleton ==null){
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
