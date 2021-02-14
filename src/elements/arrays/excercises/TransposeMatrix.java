package elements.arrays.excercises;

public class TransposeMatrix {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Please provide param:\n" +
                    "  - m[number of rows in matrix].\n" +
                    "  - n[number of columns in matrix]"
            );
            return;
        }

        // parse args, init matrix
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[][] matrix = new int[m][n];

        // assign random numbers to matrix
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = (int) (Math.random()*100);
            }
        }
        // print matrix
        System.out.println("Original Matrix: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(" " + matrix[row][col] + " ");
            }
            System.out.println();
        }
        // init transpose matrix
        int[][] transposeMatrix = new int [n][m];

        // transpose Matrix
        int temp = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                transposeMatrix[row][col] = matrix[col][row];
            }
        }

        // print inverseMatrix
        System.out.println("\n\nTranspose Matrix: ");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(" " + transposeMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
