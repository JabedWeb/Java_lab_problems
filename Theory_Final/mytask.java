package Theory_Final;

class mytasks extends Thread{
    int inter;
    int finish;
    String name;

    mytasks (int inter,int finish,String name){
        this.inter=inter;
        this.finish=finish;
        this.name=name; 

    }
    public void run(){
        for(int i=inter;i<finish;i++){
            String data=Integer.toString(i);
            int value=Integer.parseInt(data);
            System.out.println("displaying "+data+" from "+name);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class mytask extends Thread {
    public static void main(String[] args) {
        mytasks ob=new mytasks(0,20,"A");
        mytasks ob2=new mytasks(20,40,"B");
        ob.start();
        ob2.start();

        
    }
    
}
