package lab1.t2;

public class Main {
    public static void main(String[] args) {
        System.out.println(check(4,4));
    }
    public static boolean check(int x, int y) {
        if (y <= 6 && y > 0){
            if (x >= -4 && x <= 4)
                return true;
        }
        else {
            if (y <= 0 && y >= -3){
                if(x >= -6 && x <= -6){
                    return true;
                }
            }
        }
        return false;
    }
}
