import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class twoMatrixAddFile {
    public static void main(String[] args) throws IOException {
        Formatter file1 = new Formatter("matrix1.txt");
        Formatter file2 = new Formatter("matrix2.txt");
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];


        Scanner scanner=new Scanner(new File("matrix1.txt"));
        try {
            while (scanner.hasNext()) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrix1[i][j] = scanner.nextInt();
                        System.out.println(matrix1[i][j]);
                    }
                }
            }
        } catch (Exception e) {
            
        } finally {
            scanner.close();
        }

    }
}
