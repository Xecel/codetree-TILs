import java.util.*;

public class Main {
     public static void main(String[] args) {

        int N = scanInt();
            recurvePrint(N, N, true);
    }

    public static void recurvePrint(int N, int fin, boolean toggle) {
        if (!toggle && N == fin) {
            System.out.print(N);
            return;
        }

        if (N == 1) {
            System.out.print("1" + " ");
            toggle = false;
        }

        if (toggle) {
            System.out.print(N + " ");
            recurvePrint(N - 1, fin, true);
        } else {
            System.out.print(N + " ");
            recurvePrint(N + 1, fin, false);
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}