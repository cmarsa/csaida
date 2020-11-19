package elements.flowcontrol.excercises.powersofk;

public class PowersOfK {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide params:\n  - k [number to make the power series]");
            return;
        }
        int k = Integer.parseInt(args[0]);
        double power = 0;
        int i = 0;
        while (power < Long.MAX_VALUE) {
            power = Math.pow(k, i);
            i++;
            System.out.println(power);
        }
        return;
    }
}
