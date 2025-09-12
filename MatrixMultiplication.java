public class MatrixMultiplication {
    public static void main(String[] args) {
        // First matrix (2x3)
        int[][] A = {
            {1, 4, 3},
            {4, 8, 9}
        };

        // Second matrix (3x2)
        int[][] B = {
            {6, 6},
            {13, 10},
            {11, 12}
        };

        int r1 = A.length, c1 = A[0].length;
        int r2 = B.length, c2 = B[0].length;

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] result = new int[r1][c2];

        // Multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
