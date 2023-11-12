import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = scanInt();
        int b = scanInt();
        int c = scanInt();

        System.out.println(returnMinValue(a, b, c));
    }

    public static int returnMinValue(int a, int b, int c) {
        int minValue = a;
    
        if (b < minValue) {
            minValue = b;
        }

        if (c < minValue) {
            minValue = c;
        }

        return minValue;
    } 

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}