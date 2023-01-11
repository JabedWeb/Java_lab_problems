package Theory_Final;

public class matrixthre {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B[][] = {{1,2}, {3,4}, {5,6}};
        int C[][] = new int[3][2];

        Thread t1 = new Thread(matrix(A, B, C, 0));
        Thread t2 = new Thread(matrix(A, B, C, 1));
        Thread t3 = new Thread(matrix(A, B, C, 2));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Runnable matrix(int A[][], int B[][], int C[][], int i) {
        return () -> {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        };
    }
}
