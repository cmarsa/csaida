package elements.excercises;

import java.nio.DoubleBuffer;

public class HorizontalDisplacement {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide params\nx_o [m], v_o[m/s] and t[s].");
            return;
        }
        System.out.println(args.length);
        final double g = 9.80665;
        double x_o = Double.parseDouble(args[0]);
        double v_o = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double d = x_o + v_o*t + g*Math.pow(t, 2) / 2.0;
        System.out.println("Horizontal displacement d[m]: " + d);
    }
}
