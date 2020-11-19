package elements.flowcontrol.excercises.relativelyprime;

/**
 * I don't make the function computeGCD nor make an array of gcds
 * because of consistency with the books pace.
 */
public class RelativelyPrime {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - l[length of board].");
            return;
        }
        int l = Integer.parseInt(args[0]);
        int n, m;      // these m and n are the variables to compare in euclids alg
        int gcd_i = 0; // gcd of i (ith row)
        int gcd_j = 0; // hcd of j (jth row)
        int temp = 0;  // temp variable to make the proper comparison in euclids alg
        for (int i = 1; i <= l; i++) {
            System.out.print(" |");
            for (int j = 1; j <= l; j++) {
                //          euclids algorithm
                // compute gcd for i
                m = i;
                n = j;
                gcd_i = 0;
                while (gcd_i == 0) {
                    if (m >= n) {
                        if (m % n == 0)
                            gcd_i = n;
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
                // compute gcd for j
                m = i;
                n = j;
                gcd_j = 0;
                while (gcd_j == 0) {
                    if (m >= n) {
                        if (m % n == 0)
                            gcd_j = n;
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
                // compare gcds to one
                if (gcd_i == 1 && gcd_j == 1)
                    System.out.print(" * |");
                else
                    System.out.print("   |");
            }
            System.out.println("");
        }
        return;
    }
}
