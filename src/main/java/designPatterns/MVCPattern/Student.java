package designPatterns.MVCPattern;

/**
 * @auther heer
 * @create 2022/4/17
 */
public class Student {

    private String rollNo;
    private String name;

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo(){
        return rollNo;
    }
}
