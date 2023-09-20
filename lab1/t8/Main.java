package lab1.t8;

public class Main {
    public static void main(String[] args) {
        printIndexes(new double[]{1, 2, 3, 4, 5, 6 ,9}, new double[]{0, 4, 6, 7, 11});
    }
    public static void printIndexes(double sequence1[], double sequence2[]) {
        for (int i = 0; i < sequence2.length; i++)
            System.out.println(binarySearching(sequence1, 0, sequence1.length - 1, sequence2[i]));
    }

    static double binarySearching(double[] arr, int l, int r, double Elem) {
        int m = -1;
        if (Elem <= arr[l])
            return l;
        if (Elem >= arr[r])
            return r + 1;
        while (l <= r) {
            m = (l + r) / 2;
            if (Elem >= arr[m] && Elem < arr[m + 1])
                return m + 1;
            if (Elem < arr[m])
                r = m - 1;
            if (Elem > arr[m])
                l = m + 1;
        }
        return m;
    }
}
