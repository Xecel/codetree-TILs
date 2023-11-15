import java.util.*;

public class Main {
    public static void main(String[] args) {
        int year = scanInt();

        if (judge(year)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean judge(int year) {
        boolean condA = (year % 4 == 0);
        boolean condB = (year % 100 == 0);
        boolean condC = (year % 400 == 0);

        return (condA && !condB) || condC;
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}