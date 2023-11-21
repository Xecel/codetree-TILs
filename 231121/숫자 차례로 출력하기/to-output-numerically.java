import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        print(N, N);
        revPrint(N);
    }

    public static void print(int N, int fixedValue) {
        if (N == 1) {
            System.out.println(fixedValue);
            return;
        }
        System.out.print(fixedValue - N + 1 + " ");
        print(N - 1, fixedValue);
    }
    public static void revPrint(int N) {
        if (N == 1) {
            System.out.print(N);
            return;
        }
        System.out.print(N + " ");
        revPrint(N - 1);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}