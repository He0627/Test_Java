package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */
/*1、先创建一个SD卡的接口：*/
public interface SDCard{

    //读取SD卡方法
    String readSD();

    //写入SD卡功能
    int writeSD(String msg);
}
