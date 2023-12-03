import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();

        int result = recursiveSequence(n);
        System.out.println(result);
    }

    public static int recursiveSequence(int n, int a, int b) {
        if (n == 1) {
            return a;
        } else if (n == 2) {
            return b;
        } else {
            return recursiveSequence(n - 1, b, (a * b) % 100);
        }
    }

    public static int recursiveSequence(int n) {
        return recursiveSequence(n, 2, 4);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}