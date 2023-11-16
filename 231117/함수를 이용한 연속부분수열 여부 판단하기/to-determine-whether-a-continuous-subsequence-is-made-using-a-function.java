import java.util.*;

public class Main {
    public static void main(String[] args) {

        int n1 = scanInt();
        int n2 = scanInt();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < n1; i++) {
            sb1.append(Integer.toString(scanInt()));
        }
        for (int i = 0; i < n2; i++) {
            sb2.append(Integer.toString(scanInt()));
        }

        String s1 = sb1.toString();
        String s2 = sb2.toString();

        if (s1.contains(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}