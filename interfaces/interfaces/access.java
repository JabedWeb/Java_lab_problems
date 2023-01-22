package interfaces;

interface A{
  void methodA();
}

interface B {
   private void methodB();
   public void methodD();
}

class c implements A, B {
    // final int a=10;
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
    public void methodD() {
        System.out.println("Method D");
    }
}
public class access {

    public static void main(String[] args) {

        c obj=new c();
        obj.methodA();
        obj.methodB();
        // obj.f();
        
    }
    
}

