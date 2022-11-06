import java.util.Scanner;

public class duplicateValue {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
    sc.close();
        int array_size = sc.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            System.out.print("Enter the element at index " + i + " : ");
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array_size;i++){
            int count=0;
            for(int j=i+1;j<array_size;j++){
                if(array[i]==array[j]){
                    array[j]=-1;
                    count++;
                }
            }
            if(count>=1 && array[i]!=-1){
                System.out.println("The duplicate value is "+array[i]);
            }
        }
    }
}
