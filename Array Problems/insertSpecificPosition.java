import java.util.Scanner;


public class insertSpecificPosition {
    
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int [] array= new int[40];
        for(int i=0;i<array_size;i++){
            System.out.println("Enter the element at index "+i);
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be inserted");
        int value=sc.nextInt();
        System.out.println("Enter the position to be inserted");
        int position=sc.nextInt();
        for(int i=array_size-1;i>=position-1;i--){
            array[i+1]=array[i];
        }
        array[position-1]=value;
        for(int i=0;i<=array_size;i++){
            System.out.println("The element at index "+(i+1)+" is "+array[i]);
        }

    }
}
