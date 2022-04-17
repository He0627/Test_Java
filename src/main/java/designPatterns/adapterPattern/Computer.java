package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */
/*3、创建计算机接口，计算机提供读取SD卡方法：*/
public interface Computer {

    String readSD(SDCard sdCard);

}
