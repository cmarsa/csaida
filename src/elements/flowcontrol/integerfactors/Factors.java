package elements.flowcontrol.integerfactors;

public class Factors {
    public static void main(String[] args) {
        // asserting param reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - n[number to factor].");
            return;
        }
        // print the prime factorization of n
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor <= n/factor; factor++) {
            // test potential factor
            while (n % factor == 0) {
                n /= factor;
                System.out.print(factor + "  ");
            }
            // any factor of n must be greater than factor
        }
        if (n > 1)
            System.out.print(n);
        return;
    }
}
