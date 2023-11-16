import java.util.*;

public class Main {
    public static void main(String[] args) {
       int a = scanInt();
       int b = scanInt();

       System.out.println(count(a, b));
    }

    public static int count(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isUnitSumEven(i)) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUnitSumEven(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        if (sum % 2 == 0) {
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