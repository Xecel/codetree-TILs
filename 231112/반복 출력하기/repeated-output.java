import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        printLine(N);
    }

    public static void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("12345^&*()_");
        }
    }

    private static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}