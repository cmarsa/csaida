package elements.flowcontrol.binary;

public class Binary {
    public static void main(String[] args) {
        // asserting param reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - n[integer to convert].");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int power = 1;
        while (power <= n / 2)
            power *= 2;
        // now power is the largest power of 2 <= n
        while (power > 0) {
            // cast out powers of 2 in decreasing order
            if (power > n){
                // current power is greater than the remaining
                // n, so it cannot contribute or represent in binary
                // form
                System.out.print(0);
            }
            else {
                // the power is less than the remaining n, so it
                // can contribute
                System.out.print(1);
                // we decrease n by power because of the
                // contribution that power is giving to the
                // initial n
                n -= power;
            }
            // we decrease the power by 2 to look for the next contribution
            power /= 2;
        }
        System.out.println();
        return;
    }
}
