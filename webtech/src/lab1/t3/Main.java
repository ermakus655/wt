package lab1.t3;

public class Main {
    public static void main(String[] args) {
        double a = -5;
        double b = 7;
        double h = 2;
        for (double i = a; i <= b; i+=h )
            System.out.format("%.3f | %.3f\n", i, tangent(i));
    }

    private static double tangent(double x) {
        return Math.tan(x);
    }
}
