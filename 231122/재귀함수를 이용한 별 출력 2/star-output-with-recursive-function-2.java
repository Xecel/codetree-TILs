import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        printStar(N, N, false);
    }

    public static void printStar(int n, int fin, boolean rev) {
        if (n == fin + 1 && rev) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print("*" + " ");
            }
        }
        System.out.println();

        if (n == 1) {
            System.out.println("*");
            rev = true;
        }

        if (rev) {
            printStar(n + 1, fin, rev);
        } else {
            printStar(n - 1, fin, rev);
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}