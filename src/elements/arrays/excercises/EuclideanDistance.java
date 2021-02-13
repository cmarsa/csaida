package elements.arrays.excercises;

/**
 * Given two vectors of length
 * that are represented with one-dimensional
 * arrays, write a code fragment that computes the Euclidean distance between them
 * (the square root of the sums of the squares of the differences between correspond-
 * ing elements).
 */
public class EuclideanDistance {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n" +
                    "  - n[dimension of arrays].");
            return;
        }
        int n = Integer.parseInt(args[0]);

        int[] x = new int[n];
        int[] y = new int[n];

        // initialize arrays with random components
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * 10);
            y[i] = (int) (Math.random() * 10);
        }

        // compute distance
        float sumSquareDiff = 0;
        for (int i = 0; i < n; i++) {
            sumSquareDiff += Math.pow(x[i] - y[i], 2);
        }
        double distance = Math.sqrt(sumSquareDiff);

        // print results
        System.out.print("Vector x: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i]);
            System.out.print(", ");
        }
        System.out.println("}");
        System.out.print("Vector y: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(y[i]);
            System.out.print(", ");
        }
        System.out.println("}");

        System.out.println("Euclidean distance: " + distance);
    }
}
