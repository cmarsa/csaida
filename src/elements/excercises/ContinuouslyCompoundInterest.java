package elements.excercises;

public class ContinuouslyCompoundInterest {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide params\nt[years], P[dollars], r[rate].");
            return;
        }
        double t = Double.parseDouble(args[0]);
        double P = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        System.out.println("value: " + P*Math.pow(Math.E, r* t));
    }
}
