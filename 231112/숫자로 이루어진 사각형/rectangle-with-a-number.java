import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        int printValue = 1;

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (printValue > 9) {
                    printValue = 1;
                }
                if (col == N - 1) {
                    System.out.println(printValue);
                } else {
                    System.out.print(printValue);
                    System.out.print(" ");
                }
                printValue += 1;
            }
        }
    }

    private static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }

}