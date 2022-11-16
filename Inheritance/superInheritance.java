package Inheritance;

public class superInheritance {
    public static void main(String[] args) {
        Student obj1=new Student();
        obj1.display();


        Student obj2=new Teacher();
        obj2.display();


        Teacher obj3=new Teacher();
        obj3.display();

    }
    
}

class Student {
    int d=5;
    void display (){
        System.out.println("Jabed");
    }
    void eat (){
        System.out.println("I love to eat  ");
    }
} 

class Teacher extends Student{
    int d=10;
    @Override
    void display (){
        super.display();
        System.out.println("I am teacher"+super.d);
    }
}
