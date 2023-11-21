import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        printHello(N);
    }

    public static void printHello(int N) {
        System.out.println("HelloWorld");

        if (N == 1) {
            return;
        }
        printHello(N - 1);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}