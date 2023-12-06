import java.util.*;

public class Main {
    public static void main(String[] args) {

        int n = scanInt();
        int k = scanInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = scanInt();
            arrayList.add(input);
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.get(k - 1));
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }
}