import java.util.Scanner;

public class containsSpecificValue {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int [] array= new int[array_size];

        for(int i=0;i<array_size;i++){
            System.out.println("Enter the element at index "+i);
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be searched");
        int value=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<array_size;i++){
            if(array[i]==value){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
    }
    
}
