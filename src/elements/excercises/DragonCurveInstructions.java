package elements.excercises;

public class DragonCurveInstructions {
    public static void main(String[] args) {
        // compute dragon curve instructions of order
        // 0 to 5
        String drag0 = "F";
        String revDrag0 = "F";
        String drag1 = drag0 + "L" + revDrag0;
        String revDrag1 = drag0 + "R" + revDrag0;
        String drag2 = drag1 + "L" + revDrag1;
        String revDrag2 = drag1 + "R" + revDrag1;
        String drag3 = drag2 + "L" + revDrag2;
        String revDrag3 = drag2 + "R" + revDrag2;
        String drag4 = drag3 + "L" + revDrag3;
        String revDrag4 = drag3 + "R" + revDrag3;
        String drag5 = drag4 + "L" + revDrag4;
        String revDrag5 = drag4 + "R" + revDrag4;
        // print instructions
        System.out.println(drag0);
        System.out.println(drag1);
        System.out.println(drag2);
        System.out.println(drag3);
        System.out.println(drag4);
        System.out.println(drag5);
    }
}
