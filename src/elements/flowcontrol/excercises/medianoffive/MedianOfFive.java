package elements.flowcontrol.excercises.medianoffive;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfFive {
    public static void main(String[] args) {
        // assert param reception
        if (args.length != 5) {
            System.out.println("Please provide five integers separated by spaces:\n");
            return;
        }
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(array);     // this is cheating...
        System.out.println("Median: " + array[2]);
    }
}
