package Theory_Final;
public class syn extends Thread{ 

    public static void main(String[] args) throws Exception {
        syn ob1=new syn();
        syn ob2=new syn();
        ob1.start();
        ob2.start();
        // synchronized (ob1){
        //     ob1.wait();
        //     System.out.println("obj 1 Done");
        // }
        // synchronized (ob2){
        //     ob2.wait();
        //     System.out.println(" obj2 doneDone");
        // }
    }

    static synchronized void print(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
       
    }

    public void run(){
        synchronized (this){
            print();
        }    

    }
}
