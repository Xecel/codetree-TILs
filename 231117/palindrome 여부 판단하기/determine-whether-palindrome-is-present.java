import java.util.*;

public class Main {
    public static void main(String[] args) {
        String A = scanString();
        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static Scanner sc = new Scanner(System.in);
    public static String scanString() {
        return sc.next();
    }
}