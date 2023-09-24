package lab1.t5;

public class Main {
    public static void main(String[] args) {
        System.out.println(incSequence(new int[]{1,2,3,5,4,10,9}));
    }
    public static int incSequence(int[] Arr) {
        boolean isSequence=true;
        for (int i = 0; i <Arr.length-1 ; i++) {
            if(Arr[i]>Arr[i+1]){
                isSequence=false;
                break;
            }
        }
        if(isSequence) {
            return 0;
        }
        int n = Arr.length;
        int length = 0;
        final int min = -2147483648;
        final int max = +2147483647;

        int[] Array = new int[n];
        Array[0]=min;
        for (int i = 1; i < n; i++)
            Array[i] = max;

        for (int i = 0; i < n - 1; i++) {
            int j=binarySearch(Array,0,n-1,Arr[i]);
            if (Array[j-1]<Arr[i] && Arr[i] < Array[j]){
                Array[j]=Arr[i];
                length=Math.max(length,j);
            }
        }
        return n-length;

    }

    static int binarySearch(int[] arr, int l, int r, int Elem) {
        int m = -1;
        if (Elem < arr[l])
            return l;
        if (Elem > arr[r])
            return r;
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
