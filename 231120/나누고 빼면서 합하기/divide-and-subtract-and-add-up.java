import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        int m = scanInt();
        int[] A = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = scanInt();
        }

        System.out.println(fn(A, m));
    }

    public static int fn(int[] A, int m) {
        int sum = 0;
        while (m != 1) {
            sum += A[m];
            if (m % 2 ==1) {
                m -= 1;
            } else {
                m /= 2;
            }
        }

        sum += A[1];
        return sum;
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}