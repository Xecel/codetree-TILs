import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        System.out.println(calc(N));
    }

    public static int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum / 10;
    }

    private static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}