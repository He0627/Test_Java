package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */
/*2.2、创建TF卡实例*/
public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        String msg ="tf card reade msg : hello word tf card";
        return msg;
    }

    @Override
    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }

}
