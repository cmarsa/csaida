package elements.flowcontrol.excercises.marsaglia;

/**
 * prints the coordinates of a random point (a, b, c)
 * on the surfaceof a sphere.
 * Uses Marsaglias method.
 */
public class MarsagliasMethod {
    public static void main(String[] args) {
        double x, y, a, b, c;
        // scale x and y tobe random in (-1, 1)
        do {
            x = 2.0*Math.random() - 1.0;
            y = 2.0*Math.random() - 1.0;
        } while (x*x + y*y > 1.0);
        // Marsaglias method
        a = 2*x * Math.sqrt(1 - x*x - y*y);
        b = 2 * Math.sqrt(1 - x*x - y*y);
        c = 1 - 2*(x*x + y*y);
        System.out.println("(" + a + ", " + b + ", " + c + ")");
    }
}
