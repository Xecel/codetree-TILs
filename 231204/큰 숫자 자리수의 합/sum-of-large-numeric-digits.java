import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n1 = scanInt();
        int n2 = scanInt();
        int n3 = scanInt();

        System.out.println(fn(n1, n2, n3));
    }

    public static int fn(int a, int b, int c) {
        int val = a * b * c;
        int sum = 0;
        while (val > 0) {
            sum += (val % 10);
            val /= 10;
        }

        return sum;
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}