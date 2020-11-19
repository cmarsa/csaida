package elements.flowcontrol.flipcoin;

public class FlipFairCoin {
    public static void main(String[] args) {
        // simulate a fait coin flip
        if (Math.random() < 0.5)
            System.out.println("Heads");
        else
            System.out.println("Tails");
        return;
    }
}
