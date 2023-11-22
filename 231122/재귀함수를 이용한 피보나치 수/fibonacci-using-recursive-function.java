import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}