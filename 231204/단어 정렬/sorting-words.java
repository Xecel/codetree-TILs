import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = scanString();
        }

        Arrays.sort(strArr);

        for (int i = 0; i < n; i++) {
            System.out.println(strArr[i]);
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static String scanString() {
        return sc.next();
    }
    public static int scanInt() {
        return sc.nextInt();
    }
}