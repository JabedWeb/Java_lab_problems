
import java.util.Scanner;

public class integerAlternates {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size=scan.nextInt();
            int[] array=new int[size];
            for(int i=0;i<size;i++){
                System.out.print("Enter the element at index "+i+" : ");
                array[i]=scan.nextInt();
            }
            boolean flag=false;
            //let there is no zero number in the array
            for(int i=0;i<array.length;i=i+2){
                if(array[i]>0){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
                if(array[i+1]<0){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("The array contains alternate positive and negative integers");
            }
            else{
                System.out.println("The array does not contain alternate positive and negative integers");
            }
        }
    }
}
