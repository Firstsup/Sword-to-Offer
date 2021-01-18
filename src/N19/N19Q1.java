package N19;

import java.util.Scanner;

public class N19Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = scanner.nextLine();
        System.out.println(function(str, pattern));
    }

    public static boolean function(String str, String pattern) {
        int p = 0, q = 0;
        while (true) {
            if (p >= str.length() && q >= pattern.length()) {
                break;
            } else if ((p >= str.length() ^ q >= pattern.length())) {
                return false;
            }
            if (q != pattern.length() - 1 && pattern.charAt(q + 1) == '*') {
                while (pattern.charAt(q) == str.charAt(p)) {
                    p++;
                    if (p == str.length()) {
                        break;
                    }
                }
                q += 2;
            } else if (pattern.charAt(q) == str.charAt(p) || pattern.charAt(q) == '.') {
                p++;
                q++;
            } else {
                return false;
            }
        }
        return true;
    }
}
