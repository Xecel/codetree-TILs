import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = scanInt();
        int[] sequence = new int[16];
        sequence[1] = 1;
        sequence[2] = 2;

        if (n == 1 || n == 2) {
            System.out.println(sequence[n]);
        } else {
            rec(sequence, 3, n);
        }
    }

    public static void rec(int[] seq, int cur, int tar) {
        seq[cur] = seq[cur / 3] + seq[cur - 1];
        if (cur == tar) {
            System.out.println(seq[cur]);
            return;
        }
        rec(seq, cur + 1, tar);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}