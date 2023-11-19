import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        int m = scanInt();
        int[] A = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = scanInt();
        }

        for (int i = 0; i < m; i++) {
            int st = scanInt();
            int ed = scanInt();
            System.out.println(partialSum(A, st, ed));
        }
    }

    public static int partialSum(int[] A, int st, int ed) {
        int sum = 0;
        for (int i = st; i <= ed; i++) {
            sum += A[i];
        }

        return sum;
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}