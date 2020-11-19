package elements.flowcontrol.excercises.gcd;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 2) {
            System.out.println("Please provide params:\n  - m[int] and n[int]");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int gcd = 0; int temp;
        // euclids algorithm
        while (gcd == 0) {
            if (m >= n) {
                if (m % n == 0)
                    gcd = n;
                else {
                    m = m % n;
                }
            }
            else {
                // re-arrange numbers to make comparison
                temp = m;
                m = n;
                n = temp;
            }
        }
        System.out.println("gcd(" + args[0] + ", " + args[1] + "): " + gcd);
    }
}
