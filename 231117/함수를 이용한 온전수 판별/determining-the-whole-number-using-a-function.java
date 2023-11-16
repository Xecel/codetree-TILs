import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = scanInt();
        int b = scanInt();

        System.out.println(count(a, b));
    }

    public static boolean isOnjeonsu(int num) {
        return !(num % 2 == 0 || num % 10 == 5 || (num % 3 == 0 && num % 9 != 0));
    }

    public static int count(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isOnjeonsu(i)) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}