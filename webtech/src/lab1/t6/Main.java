package lab1.t6;

public class Main {
    public static void main(String[] args) {
        printMatrix(new double[]{5,4,3,7,9,10});
    }
    public static void printMatrix(double[] Arr){
        for (int i = 0; i <Arr.length ; i++) {
            for (int j=i;j <Arr .length;j++){
                System.out.printf("%.3f ",Arr[j]);
            }
            for (int n=0;n<i;n++){
                System.out.printf("%.3f ",Arr[n]);
            }
            System.out.println();
        }
    }
}
