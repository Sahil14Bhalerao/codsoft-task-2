
import java.util.Scanner;

public class StudentGradeCalculator {
    Scanner scanner = new Scanner(System.in);
    public void meth1(){
        System.out.println("Enter student Score (0-100):");
        int Score= scanner.nextInt();

        if(Score>=90){
            System.out.println("student grade is : A ");
        }
        else {
            System.out.println("student grade is : F");
        }
    }
    public static void main(String[] args){
        StudentGradeCalculator Aobj = new StudentGradeCalculator();
        Aobj.meth1();
    }



}