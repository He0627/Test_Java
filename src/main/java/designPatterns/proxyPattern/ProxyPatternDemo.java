package designPatterns.proxyPattern;

/**
 * @auther heer
 * @create 2022/4/16
 */

/*当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。*/
public class ProxyPatternDemo {
    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
