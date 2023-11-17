import java.util.*;

public class Main {
    public static void main(String[] args) {
        String A = scanString();

        if (judge(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean judge(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static Scanner sc = new Scanner(System.in);
    public static String scanString() {
        return sc.next();
    }
}