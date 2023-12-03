import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanInt();
        }

        int lcmResult = calculateLCM(numbers, n);
        System.out.println(lcmResult);
    }

    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

    private static int calculateLCM(int[] numbers, int n) {
        if (n == 1) {
            return numbers[0];
        } else {
            int lcmOfTwo = (numbers[n - 2] * numbers[n - 1]) / calculateGCD(numbers[n - 2], numbers[n - 1]);
            numbers[n - 2] = lcmOfTwo;
            return calculateLCM(numbers, n - 1);
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}