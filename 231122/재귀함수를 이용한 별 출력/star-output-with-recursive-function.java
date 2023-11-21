import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        printStar(N, N);
    }

    public static void printStar(int N, int fixedValue) {
        if (N == 0) {
            return;
        }

        for (int i = 0; i < fixedValue - N + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        printStar(N - 1, fixedValue);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}