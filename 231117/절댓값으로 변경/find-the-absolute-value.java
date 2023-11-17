import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = scanInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanInt();
        }

        fn(array);
    }

    public static void fn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] * (-1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i]);
            }
        }
    }



    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}