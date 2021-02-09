package elements.arrays.sampling;

/*
 * Sample without replacement
 */
public class Sample {
    public static void main(String [] args) {
        // assert params reception
        if (args.length != 2) {
            System.out.println("Please provide params:\n" +
                    "  - m[length of array].\n" +
                    "  - n[range].");
            return;
        }
        // print a random sample of m integers
        // from 0 ... n-1 (no duplicates.
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] perm = new int[n];

        // initialize perm[]
        for (int j = 0; j < n; j++) {
            perm[j] = j;
        }

        // take sample
        for (int i = 0; i < m; i++) {
            // exchange perm[i] with a random element to its right
            int r = i + (int)(Math.random() * (n - i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }

        // print sample
        for (int i = 0; i < m; i++)
            System.out.println(perm[i] + " ");
        System.out.println();
    }
}
