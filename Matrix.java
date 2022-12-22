// C++ program to multiply two matrices

import java.io.*;
import java.util.*;

public class Matrix implements Runnable {

	static int R1 = 3; // number of rows in Matrix-1
	static int C1 = 3; // number of columns in Matrix-1
	static int R2 = 3; // number of rows in Matrix-2
	static int C2 = 2; // number of columns in Matrix-2



	private int[][] result;
	private int[][] matrix1;
	private int[][] matrix2;
   
	Matrix(int[][] result, int[][] matrix1, int[][] matrix2) {
	 this.result = result;
	 this.matrix1 = matrix1;
	 this.matrix2 = matrix2;
	}
   
	@Override
	public void run() {
		int i, j, k;
		for (i = 0; i < R1; i++) {
			for (j = 0; j < C2; j++) {
				result[i][j] = 0;
				for (k = 0; k < R2; k++)
				result[i][j] += matrix1[i][k] * matrix2[k][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
   
	}
	public static void main(String[] args)
	{
		int[][] resul = new int[R1][C2];
		int[][] mat1 = {{1, 2, 3}, {3, 5, 7}, {2, 4, 6}};

		int[][] mat2 = {{1, 2}, {3, 7}, {4, 6}};


		if (C1 != R2) {
			System.out.println(
				"The number of columns in Matrix-1 must be equal to the number of rows in Matrix-2");
			System.out.println(
				"Please update the global variables according to your array dimension");
		}
		else {
			Thread t1 = new Thread(new Matrix(resul,mat1, mat2));
			t1.start();
		}
	}
}
