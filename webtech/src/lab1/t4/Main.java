package lab1.t4;

public class Main {
        public static void main(String[] args) {
            int[] Arr = new int[]{1, 5, 6, 11, 15, 17};
            printResult(Arr);
        }

        public static void printResult(int[] testArray) {
            boolean flag = false;
            for (int i = 0; i < testArray.length; i++)
                if (isPrime(testArray[i])) {
                    flag = true;
                    System.out.println(testArray[i]);
                }
            if (!flag)
                System.out.println("No prime numbers in array");
        }

        static boolean isPrime(int n) {
            if (n <= 1)
                return false;
            if (n == 2)
                return true;
            if (n % 2 == 0)
                return false;
            for (int i = 3; i <= Math.sqrt(n) + 1; i += 2)
                if (n % i == 0)
                    return false;
            return true;
        }
}
