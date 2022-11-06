package String;

class Student{
    String Name;
    int id;
    public Student(String Name,int roll){
        this.Name=Name;
        this.id=roll;
    }
    public Student(int roll,String name){
        this.Name=name;
        this.id=roll;
    }
    public void display(){
        System.out.println(Name);
        System.out.println(id);
    }
}

public class constructor{
    public static void main(String[] args){
       Student s1=new Student("Jabed", 0);
       Student s2=new Student(10,"Nayeem");
        s1.display();
        s2.display();
    }
}
