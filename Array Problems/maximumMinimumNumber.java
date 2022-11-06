import java.util.Scanner;

public class maximumMinimumNumber {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        try (Scanner sc = new Scanner(System.in)) {
            int array_size = sc.nextInt();
            int[] array = new int[array_size];
            for (int i = 0; i < array_size; i++) {
                System.out.print("Enter the element at index " + i + " : ");
                array[i] = sc.nextInt();
            }
            int max = array[0];
            int min = array[0];
            for(int i=0;i<array_size;i++){
                if(array[i]>max){
                    max=array[i];
                }
                if(array[i]<min){
                    min=array[i];
                }   
            }
            System.out.println("The maximum number is "+max);
            System.out.println("The minimum number is "+min);
        }
        
    }
    
}
