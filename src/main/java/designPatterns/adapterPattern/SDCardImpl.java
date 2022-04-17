package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */
/*2、创建SD卡接口的实现类，模拟SD卡的功能：*/
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }

    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
