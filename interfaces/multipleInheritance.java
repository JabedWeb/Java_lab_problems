package interfaces;


interface A{
   void methodA();
}

interface B {
    void methodB();
    int data=10;
}

class c implements A, B {
    // final int a=10;
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
}
public class multipleInheritance {

    public static void main(String[] args) {

        c obj=new c();
        obj.methodA();
        obj.methodB();
        
    }
    
}
