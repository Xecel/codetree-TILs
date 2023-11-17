// Call By Value

import java.util.*;

public class Main {

    public static void main(String[] args) {

       int[] arr = new int[2];
       arr[0] = scanInt();
       arr[1] = scanInt();
       
       swap(arr);

       System.out.println(arr[0] + " " + arr[1]);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }


    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}