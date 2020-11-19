package elements.flowcontrol.divisorpattern;

public class DivisorPattern {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide param\n  - n [the order of the squared table to print]");
            return;
        }
        // print a square that visualized divisors
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            // print the ith line
            for (int j = 1; j <= n; j++) {
                // print the jth element in the ith line
                if ((i % j == 0) || (j % i == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" |  " + i);
        }
    }
}
