import java.util.*;

public class Main {
    public static void main(String[] args) {
        int M = scanInt();
        int D = scanInt();

        if (isDateExist(M, D)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isDateExist(int month, int day) {
        if (month == 2 && day <= 28) {
            return true;
        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
            return true;
        }
        else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && day <= 31) {
            return true;
        }
        else {
            return false;
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}