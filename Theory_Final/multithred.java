package Theory_Final;

import java.util.Scanner;

class multithred{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix [][] = new int [3][3];
        int matrix2 [][] = new int [3][3];
        int matrix3 [][] = new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = (int)(Math.random()*10);
                matrix2[i][j] = (int)(Math.random()*10);
            }
        }
        //a obj=new a();
        a obj2 =new a(matrix,matrix2,matrix3);

        obj2.start();
        
    }
}

class a extends Thread{
    int matrix1[][] = new int [3][3];
    int matrix2[][] = new int [3][3];
    int matrix3[][] = new int [3][3];
    a(int matrix1[][],int matrix2[][],int matrix3[][]){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.matrix3 = matrix3;
    }
    public void run(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}