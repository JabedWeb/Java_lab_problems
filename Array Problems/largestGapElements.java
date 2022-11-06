import java.util.Arrays;
import java.util.Scanner;


public class largestGapElements {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        try (Scanner scan = new Scanner(System.in)) {
            int array_size=scan.nextInt();
            int [] array =new int[array_size];
            for(int i=0;i<array_size;i++){
                System.out.print("Enter the element at index "+i+" : ");
                array[i]=scan.nextInt();
            }
            Arrays.sort(array);
            int max=array[0];
            for(int i=1;i<array.length;i++){
                if(array[i]-array[i-1]>max){
                    max=array[i]-array[i-1];
                }
            }
            System.out.println("The largest gap between two elements is "+max);
        }   
    }
}
