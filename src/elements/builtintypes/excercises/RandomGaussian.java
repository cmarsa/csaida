package elements.builtintypes.excercises;

public class RandomGaussian {
    public static void main(String[] args) {
        // get pseudo random numbers from Math API
        double u = Math.random();
        double v = Math.random();
        // compute a random number from the gaussian dist
        double r = Math.sin(2*Math.PI*v) * Math.pow(-2*Math.log(u), 0.5);
        System.out.println(r);
    }
}
