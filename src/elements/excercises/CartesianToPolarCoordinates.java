package elements.excercises;

import java.util.function.DoubleBinaryOperator;

public class CartesianToPolarCoordinates {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide params\nx[units], y[units].");
            return;
        }
        // parse x and y to doubles
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        // compute r
        double r = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
        double theta = Math.atan2(y, x);
        System.out.println("(x, y): (" + x + ", " + y + ") is (r, theta): (" + r + ", " + theta + ").");

    }
}