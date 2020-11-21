package elements.flowcontrol.excercises.eulersumofpowers;

/**
 * The numbers a, b, c are hard-coded as the solution is near them.
 * Searching solution from 0 may take a long.
 */
public class EulerSumOfPowers {
    public static void main(String[] args) {
        // brute force crunching
        boolean found = false;
        long iteration = 0; int bar = 0;
        // long alpha = (long) Math.pow(Long.MAX_VALUE, 1.0/5.0);
        long alpha = 400;
        for (long a = 27; a < alpha; a++) {
            for (long b = 84; b < alpha; b++) {
                for (long c = 110; c < alpha; c++) {
                    for (long d = 1; d < alpha; d++) {
                        for (long e = 1; e < alpha; e++) {
                            System.out.print("iteration: " + a + " " + b + " " + c + " " + d + "\r" );
                            if (a != b
                                    && b != c
                                    && c != d
                                    && d != e
                                    && a != c
                                    && a != e
                                    && c != e
                                    && b != d
                                    && b != e)
                                if (a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d == e*e*e*e*e) {
                                    System.out.println("Solution: " + a + " " + b + " " + c + " " + d + " : " + e);
                                }
                        }
                    }
                }
            }
        }
        return;
    }
}
