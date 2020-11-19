package elements.excercises;

public class RGBToCMYK {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide params\nr, g and b.");
            return;
        }
        // parse args to double
        double r = Double.parseDouble(args[0]);
        double g = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        // compute new format
        double c, y, m, k, w;
        if (r == 0 && g == 0 && b == 0) {
            c = 0; m = 0; y = 0; k = 1;
        }
        else {
            w = Math.max(r / 255.0, g / 255.0);
            w = Math.max(w, b / 255.0);
            c = (w - (r / 255.0)) / w;
            m = (w - (g / 255.0)) / w;
            y = (w - (b / 255.0)) / w;
            k = 1.0 - w;
        }
        System.out.println("CMYK format: (" + c + ", " + m + ", " + y + ", " + k + ").");
        return;
    }
}
