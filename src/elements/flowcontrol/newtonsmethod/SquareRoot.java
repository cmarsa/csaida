package elements.flowcontrol.newtonsmethod;

public class SquareRoot {
    public static void main(String[] args) {
        // asserting param reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - c[number of which to compute the root].");
            return;
        }
        // compute the root
        double c = Double.parseDouble(args[0]);
        final double EPSILON = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON * t) {
            // replace t by the average of t and c/t
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
        return;
    }
}
