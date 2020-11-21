package elements.flowcontrol.excercises.montehall;

/**
 * The implementation is inefficient, but it is what came to my mind
 * when defining the other door the contestant chooses to change.
 * This can be done quite easily or efficient with an array.
 */
public class MonteHall {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n" +
                    "  - trials[number of trials].");
            return;
        }
        // parse params
        int trials = Integer.parseInt(args[0]);
        int counter;

        //                  simulation
        // not changing decision
        counter = 0;
        for (int trial = 0; trial < trials; trial++) {
            int prize = (int) (Math.random() * 3);
            int choice = (int) (Math.random() * 3);
            int open;
            do {
               open = (int) (Math.random() * 3);
            } while (open == prize || open == choice);
            if (prize == choice)
                counter++;
        }
        System.out.println("Fraction of winning outcome (not change): " + (float) counter / trials);
        // changing decision
        counter = 0;
        for (int trial = 0; trial < trials; trial++) {
            int prize = (int) (Math.random() * 3);
            int choice = (int) (Math.random() * 3);
            int open;
            int other;
            // compute the door to open
            do {
                open = (int) (Math.random() * 3);
            } while (open == prize || open == choice);
            // compute the other door (changing decision) to open
            //  inefficient
            do {
                other = (int) (Math.random() * 3);
            } while (other == choice || other == open);
            if (prize == other)
                counter++;
        }
        System.out.println("Fraction of winning outcome (change): " + (float) counter / trials);
        return;
    }
}
