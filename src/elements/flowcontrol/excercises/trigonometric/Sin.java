package elements.flowcontrol.excercises.trigonometric;

public class Sin {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide params:\n  - x [float]");
            return;
        }
        // parse args
        double x = Double.parseDouble(args[0]);
        // compute exp(x)
        double term = 1;
        double sum = 0.0;
        double sign = -1.0;
        for (int i = 1; i < 200; i++) {
            // System.out.println(sign + " " + term);
            term *= x / i;
            if (i % 2 != 0) {
                sign = sign * -1;
                sum += (sign * term);
                System.out.println(i + " " + " " + term + " " + sign + " " + sum);
            }
        }
        // print result
        System.out.println("sin(" + x + "): " + sum);
    }
}
