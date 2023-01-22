interface a {
    public void add();
}

abstract class b implements a {
    public void add(){
        System.out.println("b");
    }
}

class c extends b {
    @Override
    public void add(){
        System.out.println("c");
    }
}
public class twoMatrixAddFile {
    public static void main(String[] args)  {
        c ob=new c();
        ob.add();

    }
}
