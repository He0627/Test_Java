package designPatterns.strategyPattern;

/**
 * @auther heer
 * @create 2022/4/16
 */
public class OperationAdd implements Strategy{

    @Override
    public int doOperation(int num1, int num2){
        return num1 + num2;
    }
}
