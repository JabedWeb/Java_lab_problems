package Assignment;

import java.util.Scanner;

public class SecondMinimum {
    public static void main(String[] args) {

 try(Scanner scan=new Scanner(System.in)){
    System.out.println("Enter the size of array");
    int size=scan.nextInt();
    int[] array=new int[size];
    System.out.println("Enter the elements of array");
    for(int i=0;i<size;i++)
    {
        array[i]=scan.nextInt();
    }
    int min=array[0];
    int index=0;
    for(int i=1;i<array.length;i++){
        if(array[i]<min){
            min=array[i];
            index=i;
        }
    }
    for(int i=index;i<array.length-1;i++){
        array[i]=array[i+1];
    }
    int second_min=array[0];
    for(int i=1;i<array.length;i++){
        if(array[i]<second_min){
            second_min=array[i];
        }
    }
    System.out.println("This second Smallest "+second_min);
 }
    }
}
