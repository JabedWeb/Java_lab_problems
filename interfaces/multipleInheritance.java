package interfaces;


// abstract class D {
//     D(){
//         System.out.println("D");
//     }
//     abstract void f();
// }
interface A{
   void methodA();

   int a=10 ;
//    void methodC();
}

interface B {
    void methodB();
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
        // obj.f();
        
    }
    
}
