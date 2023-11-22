import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();

        recFn(n, 0);
    }

    public static void recFn(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        sum += ((n % 10) * (n % 10));
        n /= 10;
        recFn(n, sum);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}