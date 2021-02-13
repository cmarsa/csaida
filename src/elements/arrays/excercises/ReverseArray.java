package elements.arrays.excercises;

/**
 * Write a code fragment that reverses the order of the values in a one-
 * dimensional string array. Do not create another array to hold the result.
 */
public class ReverseArray {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n" +
                    "  - s[string to reverse].");
            return;
        }
        String s = args[0];
        int n = s.length();
        char[] stringToReverse = new char[n];
        for (int i = 0; i < n; i++) {
            stringToReverse[i] = s.charAt(i);
        }
        // print to output string to reverse
        for (int i = 0; i < n; i++) {
            System.out.print(stringToReverse[i]);
        }
        // reverse string
        char temp;
        for (int i = 0; i < n/2; i++) {
            temp = stringToReverse[(n-1) - i];
            stringToReverse[(n-1) - i] = stringToReverse[i];
            stringToReverse[i] = temp;
        }
        System.out.println();
        // print to output string to reverse
        for (int i = 0; i < n; i++) {
            System.out.print(stringToReverse[i]);
        }
    }
}
