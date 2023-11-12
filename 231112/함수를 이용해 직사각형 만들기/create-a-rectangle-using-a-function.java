import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        int m = scanInt();

        printStars(n, m);
    }

    public static void printStars(int n, int m) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }

    private static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}