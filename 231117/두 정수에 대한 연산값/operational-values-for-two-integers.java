import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = scanInt();
        int b = scanInt();

        fn(a, b);
    }

    public static void fn(int a, int b) {
        if (a > b) {
            System.out.println((a + 25) + " " + b * 2);
        } else {
            System.out.println(a * 2 + " " + (b + 25));
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}