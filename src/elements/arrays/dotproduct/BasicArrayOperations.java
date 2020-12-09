package elements.arrays.dotproduct;

public class BasicArrayOperations {
    public static void main(String[] args) {
        // declare arrays
        int n = 10;
        double[] x = new double[n];
        double[] y = new double[n];

        // set random numbers to arrays
        for (int i = 0; i < n; i++) {
            x[i] = Math.random();
            y[i] = Math.random();
        }

        // dot product
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += x[i] * y[i];
        }

        //      print arrays and dot product
        // array x
        System.out.println("x: ");
        for (int i = 0; i < n; i++)
            System.out.println(x[i]);
        System.out.println("y: ");
        for (int i = 0; i < n; i++)
            System.out.println(y[i]);
        System.out.println("Dot product: ");
        System.out.println(sum);

        // find maximum of array x values
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (x[i] > max)
                max = x[i];
        }
        System.out.println("max of x: " + max);

        // average of array x
        sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += x[i];
        }
        double average = sum / n;
        System.out.println("average of x: " + average);

        // reverse values in array x
        for (int i = 0; i < n/2; i++)
        {
            double temp = x[i];
            x[i] = x[n-1-i];
            x[n-i-1] = temp;
        }
        System.out.println("reversed x: ");
        for (int i = 0; i < n; i++)
            System.out.println(x[i]);

        // copy a sequence of values to other array
        double[] b = new double[n];
        for (int i = 0; i < n; i++)
            b[i] = x[i];
        System.out.println("array b (copy of latest x): ");
        for (int i = 0; i < n; i++)
            System.out.println(b[i]);
    }
}
