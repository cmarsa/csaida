package elements.arrays.testmemoryalloc;

public class TestMemoryAlloc {
    public static void main(String[] args) {
        // assert params reception
        if (args.length != 1) {
            System.out.println("Please provide param:\n" +
                    "  - n[length of array].");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
