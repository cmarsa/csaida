package elements.builtintypes.excercises;

public class BetweenDays {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide params\nd[day], m[month].");
            return;
        }
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        boolean isBetween = false;
        if (m >= 3 && m <= 6) {
            if (m == 3) {
                if (d < 20)
                    System.out.println("false");
                else
                    if (d > 0)
                        System.out.println("true");
            }
            else if (m == 6) {
                if (d > 20)
                    System.out.println("false");
                else
                    System.out.println("true");
            }
            else {
                System.out.println("true");
            }
        }
        else {
            System.out.println("false");
        }
    }
}
