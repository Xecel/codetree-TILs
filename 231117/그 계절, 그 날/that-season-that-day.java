import java.util.*;

public class Main {
    public static void main(String[] args) {
        int Y = scanInt();
        int M = scanInt();
        int D = scanInt();

        int result = checkSeason(Y, M, D);

        if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println(getSeason(result));
        }
    }

    public static int checkSeason(int year, int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return -1;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        if (day > daysInMonth[month]) {
            return -1;
        }

        return month;
    }

    public static String getSeason(int month) {
        if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else if (month >= 9 && month <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}