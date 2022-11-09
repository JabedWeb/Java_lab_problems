package LabThree;
import java.util.Scanner;

public class matrixTwo {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        int[][] b = new int[2][2];
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of matrix A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("The elements of matrix A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
}
}
