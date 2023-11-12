import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        int m = scanInt();
        System.out.println(lcm(n, m));
    }

    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int x, int y) {
         return (x * y) / gcd(x, y);
    }

    private static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}