package lab1.t1;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculation(10, 12));
    }

    public static double calculation(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
    }
}
