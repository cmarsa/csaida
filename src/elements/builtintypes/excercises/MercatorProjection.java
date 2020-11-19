package elements.builtintypes.excercises;
/**
 * The Mercator Projection is a conformal (angle preserving)
 * projection that maps latitude phi and longitude lambda to
 * rectangular coordinates (x, y). The projection is defined by
 * the equations:
 *      x = lambda - lambda_o
 *      y = 1/2 ln((1 + sin(phi) / (1 - sin(phi)),
 * where lambda_o is the longitude of the point in the center
 * of the map.
 */
public class MercatorProjection {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide params\nphi, lambda and lambda_o.");
            return;
        }
        // parse args to double
        double phi = Double.parseDouble(args[0]);
        double lambda = Double.parseDouble(args[1]);
        double lambda_o = Double.parseDouble(args[2]);
        // compute projections
        double x = lambda - lambda_o;
        double y = (1/2) * Math.log((1 + Math.sin(phi)) / (1 - Math.sin(phi)));
        // print results
        System.out.println("Projection in (x, y): (" + x + ", " + y + ").");
    }
}
