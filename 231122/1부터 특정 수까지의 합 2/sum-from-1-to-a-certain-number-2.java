import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();

        factorial(n, 0);
    }

    public static void factorial(int n, int sum) {
        if (n == 1) {
            System.out.println(sum + 1);
            return;
        }

        factorial(n - 1, sum + n);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}