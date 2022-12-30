package LabThree;

import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;


class Write {
    static void writeMatrix(String filename, int[][] matrix) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    bw.write(matrix[i][j] + " ");
                }
                bw.newLine();
            }
            bw.flush();
        }
        catch (IOException e) {
            System.out.println(e);
        }
}
}
public class FileMatrix {
    public static void main(String[] args) throws IOException {
            int[][] matrix = new int[3][3];
        int[][] matrix2 = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the first matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        int [] [] mul=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mul[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    mul[i][j]+=matrix[i][k]*matrix2[k][j];
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        
        File file1=new File ("D:/Java/LabThree/matrix1.txt");
        File file2=new File ("D:/Java/LabThree/matrix2.txt");
        File file3=new File ("D:/Java/LabThree/matrix3.txt");
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        String filename1=file1.getName();
        String filename2=file2.getName();
        String filename3=file3.getName();
        Write obj=new Write();
        obj.writeMatrix(filename1,matrix);
        obj.writeMatrix(filename2,matrix2);
        obj.writeMatrix(filename3,mul);
        System.out.println("file1.getAbsoluteFile() = " + file1.getAbsoluteFile());
    }
}
