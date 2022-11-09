

package LabThree;

import java.util.Scanner;


public class matrixOne {
    public int [] [] matrixone() {

        // TODO Auto-generated method stub
        int[][] a = new int[2][2];
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of matrix A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("The elements of matrix A:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return a;
}

}
