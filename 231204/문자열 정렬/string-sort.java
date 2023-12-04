import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = scanString();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println(sortedStr);
    }

    public static Scanner sc = new Scanner(System.in);
    public static String scanString() {
        return sc.next();
    }
}