import java.util.Scanner;

public class arraySum {
    public static void main(String[] args){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int array_size=sc.nextInt();
        

        int [] array=new int [array_size];
        for(int i =0;i<array_size;i++){
            System.out.println("Enter the element at index "+i);
            array[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<array_size;i++){
            sum=sum+array[i];
        }
        System.out.println("The sum of the array is "+sum);
    }
}
