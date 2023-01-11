package Theory_Final;

interface inter{
    final int a=5;
    void print();
}

public class interthread {
    public static void main(String[] args) throws Exception {
        syn ob1=new syn();
        ob1.setName("abul");
       System.out.println(ob1.getName());
        syn ob2=new syn();
        ob2.setName("babul");
        ob1.start();
        ob2.start();
        synchronized (ob2){
            ob2.wait();
            System.out.println(" obj 1 doneDone");
        }
    }

    public void run(){
        synchronized (this){
            for(int i=0;i<5;i++){
                System.out.print(i+Thread.currentThread().getName());
            }
            this.notify();
                                                                                     
        }    
    }
}
