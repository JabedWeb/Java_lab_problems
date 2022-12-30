package exceptionsLab08;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception{
    AgeOutOfRangeException(int age){
        System.out.println("You are older than requested age (25 Years)"+"you are "+age);
    }
}
class LowGpaException extends Exception{
    LowGpaException(double gpa){
        System.out.println("Your GPA is not sufficient to apply for this job(2.5)");
    }
}
public class GPA {

public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter your age");
    int age=scan.nextInt();
    System.out.println("Enter your GPA");
    double gpa=scan.nextDouble();
    if (age<25 && gpa>2.5){
        System.out.println("Your Application is accepted for this job");
    }
    else{
        try {
            if(age>25){
                throw new AgeOutOfRangeException(age);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            if(gpa<2.5){
                throw new LowGpaException(gpa);
           }
        } catch (Exception e) {
            System.out.println(e);
        }
   }
}
}
