package elements.excercises;

public class DrawNUniformRandom {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide param\nN[sample size].");
            return;
        }
        int N = Integer.parseInt(args[0]);
        double[] sample = new double[N];
        double sum = 0.0;
        // get the sample from the distribution
        for (int i = 0; i < N; i++) {
            sample[i] = Math.random();
            sum += sample[i];
        }
        //          compute basic statistics
        // compute average
        double average = sum / sample.length;
        // compute minimum
        double minimum = sample[0];
        for (int i = 1; i < N; i++) {
            minimum = Math.min(minimum, sample[i]);
        }
        // compute maximum
        double maximum = sample[0];
        for (int i = 1; i < N; i++) {
            maximum = Math.max(maximum, sample[i]);
        }

        System.out.println("N: " + N);
        System.out.println("average: " + average);
        System.out.println("minimum: " + minimum);
        System.out.println("maximum: " + maximum);
    }
}
