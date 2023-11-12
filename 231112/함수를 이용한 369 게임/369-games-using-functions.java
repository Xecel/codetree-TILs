import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = scanInt();
        int b = scanInt();
        int cnt = 0;

        for (int v = a; v <= b; v++) {
            if (isSpecialNumber(v)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isSpecialNumber(int n) {
        boolean isSpecial = false;
        int tempN = n;

        while (tempN > 0) {
            int unit = tempN % 10;
            if (unit == 3 || unit == 6 || unit == 9) {
                isSpecial = true;
            }
            tempN /= 10;
        }

        if (isSpecial || n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}