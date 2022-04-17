package designPatterns.singleObject;

/**
 * @auther heer
 * @create 2022/4/14
 */
/*测试枚举类*/
public class Test {
    public static void main(String[] args) {
        System.out.println(User.getInstance());
        System.out.println(User.getInstance());
        System.out.println(User.getInstance() == User.getInstance());
    }
}
