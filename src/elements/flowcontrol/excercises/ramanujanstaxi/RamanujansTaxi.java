package elements.flowcontrol.excercises.ramanujanstaxi;

public class RamanujansTaxi {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide params:\n  - n [top integer to find ramanujans taxi numbers]");
            return;
        }
        long n = Integer.parseInt(args[0]);
        System.out.println(n);
        long a_cube = 0; long b_cube = 0; long c_cube; long d_cube = 0;
        long lastLeftProduct = 0;
        long lastRightProduct = 0;
        for (long a = 0; a < n; a++) {
            a_cube = a*a*a;
            for (long b = 0; b < n; b++) {
                b_cube = b*b*b;
                for (long c = 0; c < n; c++) {
                    c_cube = c*c*c;
                    for (long d = 0; d < n; d++) {
                        d_cube = d*d*d;
                        if (a != b && b != c && c != d && d!= a && a != c && b != d) {
                            if (a_cube + b_cube == c_cube + d_cube && a_cube + b_cube > lastLeftProduct) {
                                System.out.print(a + " " + b + " " + c + " " + d + " : ");
                                System.out.println(a_cube + b_cube);
                                lastLeftProduct = a_cube + b_cube;
                            }
                        }
                        if (c_cube + d_cube > n)
                            break;
                    }
                }
                if (a_cube + b_cube > n)
                    break;
            }
        }
        return;
    }
}
