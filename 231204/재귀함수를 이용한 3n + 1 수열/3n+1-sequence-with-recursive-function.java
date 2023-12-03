import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        rec(n, 0);
    }

    public static void rec(int n, int trial) {
        if (n == 1) {
            System.out.println(trial);
            return;
        }
        if (n % 2 == 0) {
            rec(n / 2, trial + 1);
        } else {
            rec(n * 3 + 1,  trial + 1);
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}