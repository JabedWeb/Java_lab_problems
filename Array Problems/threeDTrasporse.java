import java.util.Scanner;

public class threeDTrasporse{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();
            int [] [] [] array=new int[20][20] [20];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        array[i][j][k]=scan.nextInt();
                    }
                    System.out.print("\n ");
                }
            }


            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                       System.out.print(array[i][k][j]);
                    }
                }
                System.out.print("\n ");
            }
        }
    }
    
}
