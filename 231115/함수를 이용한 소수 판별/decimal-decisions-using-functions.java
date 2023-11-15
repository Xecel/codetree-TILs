import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = scanInt();
        int b = scanInt();

        eratos(a, b);
    }

    public static void eratos(int st, int ed) {
        boolean[] isPrime = new boolean[ed + 1];

        for (int i = 2; i <= ed; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= ed; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= ed; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        for (int v = st; v <= ed; v++) {
            if (isPrime[v]) {
                sum += v;
            }
        }

        System.out.println(sum);
    }


    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}