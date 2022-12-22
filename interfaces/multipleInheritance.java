package interfaces;


interface A{
    static String datas="X";
    static String datas2="X";
}

interface B {
    static String Mdatas="X";
    static String Mdatas2="y";
}

class c implements A, B {

    public void methodB() {
        System.out.print(datas+" "+Mdatas);
    }
}
public class multipleInheritance {

    public static void main(String[] args) {

        c obj=new c();
        obj.methodB();
        
    }
    
}
