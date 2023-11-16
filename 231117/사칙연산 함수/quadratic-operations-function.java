import java.util.*;

public class Main {

    public static void main(String[] args) {

        int a = scanInt();
        String cmd = scanString();
        int b = scanInt();

        op(a, b, cmd);
    }

    public static void op(int a, int b, String cmd) {
        int val = 0;

        switch(cmd) {
            case "+":
                val = a + b;
                break;
            case "-":
                val = a - b;
                break;
            case "*":
                val = a * b;
                break;
            case "/":
                val = a / b;
                break;
            default:
                System.out.println("False");
                return;
        }

        System.out.println(a + " " + cmd + " " + b + " = " + val);
    }

    public static Scanner sc = new Scanner(System.in);
    public static int scanInt() {
        return sc.nextInt();
    }

    public static String scanString() {
        return sc.next();
    }

}