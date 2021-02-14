package elements.arrays.excercises;

public class MultiplyTwoSquareBoolMatrices {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                    "Please provide param:\n" +
                            "  - n[dimension of square matrices].\n"
            );
            return;
        }
        int n = Integer.parseInt(args[0]);
        // define the square matrices
        boolean[][] M = new boolean[n][n];
        boolean[][] N = new boolean[n][n];
        boolean[][] P = new boolean[n][n];

        // init matrix M
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() > 0.5) {
                    M[i][j] = true;
                }
                else {
                    M[i][j] = false;
                }
            }
        }

        // init matrix N
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() > 0.5) {
                    N[i][j] = true;
                }
                else {
                    N[i][j] = false;
                }
            }
        }

        // multiply matrices
        boolean dot = false;
        for (int i = 0; i < n; i++) {
            dot = false;
            for (int j = 0; j < n; j++) {
                P[i][j] = P[i][j] || M[i][j] && N[j][i];
            }
        }

        // print matrix multipilication
        // matrix M
        System.out.println("Matrix M:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + M[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // matrix N
        System.out.println("Matrix N:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + N[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // product
        System.out.println("Product: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + P[i][j] + " ");
            }
            System.out.println();
        }
    }
}
