package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */
public class ComputerReadDemoTFandSD {
    public static void main(String[] args) {

        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("====================================");

        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}
