import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return n;
        }

        return n * factorial(n - 1);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}