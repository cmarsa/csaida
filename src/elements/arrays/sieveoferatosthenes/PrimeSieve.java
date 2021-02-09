package elements.arrays.sieveoferatosthenes;

/**
 * This program takes an integer command-line argument n and computes the number of primes
 * less than or equal to n . To do so, it computes a boolean array with isPrime[i] set to true if
 * i is prime, and to false otherwise. First, it sets to true all array elements to indicate that no
 * numbers are initially known to be nonprime. Then it sets to false array elements correspond-
 * ing to indices that are known to be nonprime (multiples of known primes). If a[i] is still true
 * after all multiples of smaller primes have been set to false , then we know i to be prime. The
 * termination test in the second for loop is i <= n/i instead of the naive i <= n because any
 * number with no factor less than n/i has no factor greater than n/i , so we do not have to look
 * for such factors. This improvement makes it possible to run the program for large n .
 */
public class PrimeSieve {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide params:\n" +
                    "  - n[upper limit].");
            return;
        }
        // print the number of primes <= n.
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;
        for (int i = 2; i <= n/i; i++) {
            if (isPrime[i]) {
                // mark multiples of i as nonprime
                for (int j = i; j <= n/i; j++)
                    isPrime[i * j] = false;
            }
        }
        // count the primes
        int primes = 0;
        for (int i = 2; i <= n; i++)
            if (isPrime[i])
                primes++;
        System.out.println(primes);
    }
}
