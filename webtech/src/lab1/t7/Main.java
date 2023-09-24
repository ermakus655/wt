package lab1.t7;

public class Main {
    public static void main(String[] args) {
        shellSort(new int[]{41, 15, 82, 5, 65, 19, 32, 43, 8});
    }
    public static void shellSort(int Arr[]) {
        int n = Arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = Arr[i];
                int j = i;
                while (j >= gap && Arr[j - gap] > key) {
                    Arr[j] = Arr[j - gap];
                    j -= gap;
                }
                Arr[j] = key;
            }
        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
}
