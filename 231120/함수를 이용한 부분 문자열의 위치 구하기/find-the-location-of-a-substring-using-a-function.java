import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = scanString();
        String target = scanString();

        System.out.println(findSubstringIndex(input, target));
    }

    public static int findSubstringIndex(String input, String target) {
        int inputLength = input.length();
        int targetLength = target.length();

        for (int i = 0; i <= inputLength - targetLength; i++) {
            boolean found = true;

            for (int j = 0; j < targetLength; j++) {
                if (input.charAt(i + j) != target.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return i; // 부분 문자열이 발견된 경우 시작 인덱스 반환
            }
        }

        return -1; // 부분 문자열이 존재하지 않는 경우 -1 반환
    }


    public static Scanner sc = new Scanner(System.in);
    public static String scanString() {
        return sc.next();
    }
}