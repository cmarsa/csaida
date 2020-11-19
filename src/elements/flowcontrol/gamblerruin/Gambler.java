package elements.flowcontrol.gamblerruin;

public class Gambler {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide params:\n" +
                               "  - stake[initial stake $]\n" +
                               "  - goal[walkaway goal $]\n" +
                               "  - trials[number of trials].");
            return;
        }
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        // run `trials` experiments
        for (int t = 0; t < trials; t++) {
            System.out.print(t + "/" + trials);
            System.out.print("\r");
            // run one experiment
            int cash = stake;
            while (cash > 0 && cash < goal) {
                // simulate one bet
                bets++;
                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            // cash is either 0 (ruin) or goal (win)
            if (cash >= goal)
                wins++;
        }
        // print results
        System.out.println(100*wins/trials + "% wins");
        System.out.println("average # of bets: " + bets/trials);
    }
}
