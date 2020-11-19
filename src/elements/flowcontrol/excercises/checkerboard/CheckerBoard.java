package elements.flowcontrol.excercises.checkerboard;

public class CheckerBoard {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide param:\n  - n[size of board].");
            return;
        }
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++) {
            System.out.print("|");
            for (int j = 0; j <= n; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(" * |");
                else
                    System.out.print("   |");
            }
            System.out.println("");
        }
        return;
    }
}
