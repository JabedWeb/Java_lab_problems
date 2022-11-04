
import java.util.Scanner;

public class missingIncreasingLetters {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
      String[] array=  new String[array_size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the element at index "+i+" : ");
            array[i]=sc.nextLine();
        }
        // String[] array={"A","B","D","E"};
        // int array_size = 4;
        System.out.print("The missing letters are : ");
        int ch=array[0].charAt(0)+1;
        for(int i=1;i<array_size;i++,ch++){
            // System.out.print("index value "+array[i].charAt(0));
            // System.out.print( " "+(char)ch+" ");
            if(array[i].charAt(0)!=(char)ch){
                // System.out.print("Ok");
                // System.out.print("index value "+array[i].charAt(0));
                System.out.print( " "+(char)ch+" ");
                return ;
            }
        }
    }
}
