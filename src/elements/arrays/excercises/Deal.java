package elements.arrays.excercises;

/**
 * Write a program Deal that takes an integer command-line argument n and
 * prints n poker hands (five cards each) from a shuffled deck, separated by blank lines.
 */
public class Deal {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide params:\n" +
                    "  - n[number of cards to sample from deck].");
            return;
        }
        int n = Integer.parseInt(args[0]);

        // create deck
        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        boolean[][] isDealt = new boolean[RANKS.length][SUITS.length];

        // shuffle and deal n cards without replacement
        int randomRank = 0;
        int randomSuit = 0;
        for (int i = 0; i < n; i++) {
            // check if the card is already dealt, if it is not, deal
            // else, get another random combination.
            while (isDealt[randomRank][randomSuit]) {
                randomRank = (int) (Math.random() * RANKS.length);
                randomSuit = (int) (Math.random() * SUITS.length);
            }
            System.out.println(RANKS[randomRank] + " of " + SUITS[randomSuit]);
            isDealt[randomRank][randomSuit] = true;
        }
    }
}
