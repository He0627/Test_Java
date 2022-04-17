package designPatterns.singleObject;

/**
 * @auther heer
 * @create 2022/4/14
 */

/*枚举单例模式*/
public class User {

    //私有化构造函数
    private User(){};

    //定义一个静态枚举类
    static enum SingletonEnum{
        //创建一个枚举对象，该对象天生为单例
        INSTACNE;
        private User user;
        //私有化枚举的构造函数
        private SingletonEnum(){
            user = new User();
        }
        public User getInstance(){
            return user;
        }
    }
    //对外暴露一个获取User对象的静态方法
    public static User getInstance(){
        return SingletonEnum.INSTACNE.user;
    }
}
