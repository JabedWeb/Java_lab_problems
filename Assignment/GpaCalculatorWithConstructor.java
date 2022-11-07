package Assignment;
import java.util.Scanner;


class Student{
    String name;
    int roll;
    double marks1;
    double marks2;
    double gpa;
    Student (String n,int id,double m1,double m2){
        name=n;
        roll=id;
        marks1=m1;
        marks2=m2;
        
    }
    void member(){
        gpa=(marks1+marks2)/2;
        System.out.print(gpa);
        if(marks1 >33 && marks2 >33){
            if(gpa>=90){
                System.out.println("A+");
            }
            else if(gpa>=80){
                System.out.println("A");
            }
            else if(gpa>=70){
                System.out.println("B");
            }
            else if(gpa>=60){
                System.out.println("C");
            }
            else{
                System.out.println("D");
            }
        }
        else{
            System.out.println("Fail");
        }

    }
    void display(){
 
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.print("GPA : ");
        member();
    }


}

public class GpaCalculatorWithConstructor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of students:");
        String name=scan.nextLine();
        System.out.println("Enter the id of students :");
        int id=scan.nextInt();
        System.out.println("Enter the marks1 value of student:");
        double marks1=scan.nextDouble();
        System.out.println("Enter the marks2 value of student:");
        double marks2=scan.nextDouble();
        scan.close();

        
        Student student1=new Student(name,id,marks1,marks2);
        student1.display();
    }
}
