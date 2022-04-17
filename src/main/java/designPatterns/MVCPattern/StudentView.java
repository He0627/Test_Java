package designPatterns.MVCPattern;

/**
 * @auther heer
 * @create 2022/4/17
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
