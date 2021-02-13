package elements.arrays.randomwalk;

public class PrintTwoDimensionalBoolArray {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n" +
                    "  - n[dimension of bool squared matrix].");
            return;
        }
        int n = Integer.parseInt(args[0]);
        boolean[][] matrix = new boolean[n][n];

        // create random bool matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() > 0.5) {
                    matrix[i][j] = true;
                }
                else {
                    matrix[i][j] = false;
                }
            }
        }

        //              print matrix
        System.out.print("     ");
        // print col numbers
        for (int j = 0; j < n; j++) {
            System.out.print(j + "  ");
        }
        System.out.println();
        // print row
        for (int i = 0; i < n; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < n; j++) {
                if (matrix[i][j])
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
