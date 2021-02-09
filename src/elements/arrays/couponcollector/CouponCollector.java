package elements.arrays.couponcollector;

public class CouponCollector {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n" +
                    "  - n[range].");
            return;
        }
        // generate random values in [0...n) until finding each one
        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while (distinct < n) {
            // generate another coupon
            int r = (int) (Math.random() * n);
            count++;
            if (!isCollected[r]) {
                distinct++;
                isCollected[r] = true;
            }
        } // n distinct coupons found
        System.out.println(count);
    }
}
