package elements.flowcontrol.excercises.exponential;

public class ExponentialFunction {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide params:\n  - x [float]");
            return;
        }
        // parse args
        double x = Double.parseDouble(args[0]);
        // compute exp(x)
        double term = 1.0;
        double sum = 0.0;
        for (int i = 1; i < 20; i++) {
            sum += term;
            term *= x/i;
        }
        // print result
        System.out.println("exp(" + x + "): " + sum);
    }
}
