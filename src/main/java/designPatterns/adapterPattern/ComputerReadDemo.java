package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */

/*5、这时候就可以模拟计算机读取SD卡功能：*/
public class ComputerReadDemo {
    public static void main(String[] args) {

        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();

        System.out.println(computer.readSD(sdCard));
    }
}