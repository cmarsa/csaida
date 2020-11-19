package elements.flowcontrol.harmonicsum;

public class HarmonicSum {
    public static void main(String[] args) {
        // asserting param reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - n[first n harmonic numbers].");
            return;
        }
        // compute the nth harmonic number
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            // add the ith term to the sum
            sum += 1.0 / i;
        }
        System.out.println(sum);
        return;
    }
}
