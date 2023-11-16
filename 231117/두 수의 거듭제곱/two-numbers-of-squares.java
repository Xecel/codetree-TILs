import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = scanInt();
        int b = scanInt();
        
        System.out.println(calc(a, b));
    }
    
    public static int calc(int a, int b) {
        int val = a;
        for (int rec = 0; rec < b - 1; rec++) {
            val *= a;
        }
        return val;
    }
    
    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}