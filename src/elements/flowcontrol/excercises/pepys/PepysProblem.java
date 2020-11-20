package elements.flowcontrol.excercises.pepys;

public class PepysProblem {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n" +
                    "  - trials[number of trials].");
            return;
        }
        // parse params
        int trials = Integer.parseInt(args[0]);
        int die = 0;
        int counter = 0;
        int winsExperimentOne = 0;
        int winsExperimentTwo = 0;
        // experiment1: roll 6 times get 1 at least 1 time
        for (int trial = 0; trial < trials; trial++) {
            System.out.print("Experiment 1, trial: " + trial + "\r");
            counter = 0;
            for (int i = 0; i < 6; i++) {
                die = (int) (Math.random() * 6 + 1);
                if (die == 1)
                    counter++;

            }
            if (counter >= 1)
                winsExperimentOne++;
        }
        // experiment2: roll 12 times get 1 at least 2 times
        for (int trial = 0; trial < trials; trial++) {
            System.out.print("Experiment 2, trial: " + trial + "\r");
            counter = 0;
            for (int i = 0; i < 12; i++) {
                die = (int) (Math.random() * 6 + 1);
                if (die == 1)
                    counter++;

            }
            if (counter >= 2)
                winsExperimentTwo++;
        }
        // print results
        System.out.println("outcome experiment 1: " + (float) (winsExperimentOne) / trials);
        System.out.println("outcome experiment 2: " + (float) (winsExperimentTwo) / trials);
    }
}
