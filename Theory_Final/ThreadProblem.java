package Theory_Final;


class Mytask implements Runnable{

    private int interval;
    private String name;

    Mytask(int interval,String name){
        this.interval=interval;
        this.name=name;
    }

  @Override
    public void run(){
        try{
            for(int i=0;i<40;i++){
                System.out.println("Displaying"+i +"  "+name);
                Thread.sleep(interval);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }

    public String toString(){
        return "task name"+name;
    }

}



public class ThreadProblem  {

    public static void main(String[] args)  {

        Mytask task1=new Mytask(1000,"task1");
        Mytask task2=new Mytask(2000,"task2");

        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);;

       try {
        t1.start();
        t1.join();
        t2.start();
       } catch (Exception e) {
        // TODO: handle exception
       }

    }
    
}
