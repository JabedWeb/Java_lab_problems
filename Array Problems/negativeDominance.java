
import java.util.Scanner;



public class negativeDominance {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the element at index "+i+" : ");
            array[i]=scan.nextInt();
        }
   
       int max=0;
       int min=0;
        for (int i = 0; i < array.length; i++) {  
        
            if(array[i]<0){
                max++;
            }
            else{
                min++;
            }
        }
        if(max>min){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
