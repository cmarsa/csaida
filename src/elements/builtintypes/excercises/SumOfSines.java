package elements.builtintypes.excercises;

public class SumOfSines {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double result = Math.sin(2*t) + Math.sin(3*t);
        System.out.println("sin(2*" + t + ") + sin(3*" + t + ") = " + result);
    }
}
