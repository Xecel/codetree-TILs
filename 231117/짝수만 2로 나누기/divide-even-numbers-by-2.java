import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        int[] array = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            array[i] = scanInt();
        }

        fn(array);

        for (int i = 1; i <= N; i++) {
            if (i != N) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i]);
            }
        }
    }

    public static void fn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] /= 2;
            } 
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}