import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();  

        recFn(n, 0);
    }
    
    public static void recFn(int n, int attempt) {
        if (n == 1) {
            System.out.println(attempt);
            return;
        }

        if (n % 2 == 0) {
            n /= 2;
        } else {
            n /= 3;
        }

        recFn(n, attempt + 1);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}