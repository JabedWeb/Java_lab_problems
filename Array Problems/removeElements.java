import java.util.Scanner;

public class removeElements {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at index " + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be removed");
        int element = sc.nextInt();
        for (int i = element; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("The element at index " + (i + 1) + " is " + array[i]);
        }
    }

}