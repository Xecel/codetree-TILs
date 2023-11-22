import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();

        System.out.println(fn(n));
    }

    public static int fn(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + fn(n - 2);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}