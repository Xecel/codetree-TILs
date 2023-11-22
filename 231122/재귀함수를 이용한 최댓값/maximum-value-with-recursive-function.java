import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanInt();
        }

        System.out.println(recMaxima(n - 1, array));
    }

    public static int recMaxima(int ind, int[] array) {
        if (ind < 0) {
            return 0;
        }
        return maxValue(array[ind], recMaxima(ind -
         1, array));
    }

    public static int maxValue(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}