package elements.flowcontrol.powersoftwo;

public class PowersOfTwo {
    public static void main(String[] args) {
        // asserting param reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - n[first n powers].");
            return;
        }
        // print the first n powers of 2
        int n = Integer.parseInt(args[0]);
        int power = 1;
        int i = 0;
        while (i <= n) {
            System.out.println(i + "  " + power);
            power = 2 * power;
            i += 1;
        }
        return;
    }
}
