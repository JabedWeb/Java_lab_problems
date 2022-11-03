import java.util.Arrays;
import java.util.Scanner;

public class sortingNumeric {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int [] array= new int[array_size];

        for(int i=0;i<array_size;i++){
            System.out.println("Enter the element at index "+i);
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i<array_size;i++){
            System.out.println("The element at index "+(i+1)+" is "+array[i]);
        }

    }
    
}
