package elements.flowcontrol.binary;

/**
 * Convert number representation from decimal to
 * binary using succesive division
 */
public class BinaryAlt {
    public static void main(String[] args) {
        // asserting param reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - n[integer to convert].");
            return;
        }
        int n = Integer.parseInt(args[0]);
        String binary = "";
        while (n > 0) {
            if (n % 2 != 0) {
                // we append binary after the bit
                // because the most significant bits
                // are the last ones (or are the ones
                // that are computed last
                binary = "1" + binary;
            }
            else {
                binary = "0" + binary;
            }
            n /= 2;
        }
        System.out.println(binary);
        return;
    }
}
