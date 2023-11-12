import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        if (isSpecialNumber(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSpecialNumber(int n) {
        int unitSum = 0;
        int tempN = n;
        while (tempN > 0) {
            unitSum += (tempN % 10);
            tempN /= 10;
        }
        if (n % 2 == 0 && unitSum % 5 == 0) {
            return true;
        }
        return false;
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}