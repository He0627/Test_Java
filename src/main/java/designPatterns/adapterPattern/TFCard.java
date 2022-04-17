package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */

/*接下来在不改变计算机读取SD卡接口的情况下，通过适配器模式读取TF卡：*/
/*2.1、创建TF卡接口*/
public interface TFCard {

    String readTF();

    int writeTF(String msg);
}
