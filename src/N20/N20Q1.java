package N20;

import java.util.Scanner;

public class N20Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(function(str));
    }

    public static boolean function(String str) {
        String integerPart = "";
        String decimalPart = "";
        String indexPart = "";
        int pointPosition = -1;
        int ePosition = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                integerPart = str.substring(0, i);
                pointPosition = i;
                break;
            }
        }
        for (int i = Math.max(pointPosition, 0); i < str.length(); i++) {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                if (pointPosition != -1) {
                    decimalPart = str.substring(pointPosition + 1, i);
                    ePosition = i;
                } else {
                    integerPart = str.substring(0, i);
                    ePosition = i;
                }
                break;
            }
        }
        if (ePosition != -1) {
            indexPart = str.substring(ePosition + 1);
        }
        if (ePosition == -1 && pointPosition != -1) {
            decimalPart = str.substring(pointPosition + 1);
        }
        if (pointPosition == -1 && ePosition == -1) {
            integerPart = str;
        }
        if (ePosition != -1 && indexPart.equals("")) {
            return false;
        }
        return integer(integerPart) & decimal(decimalPart) & index(indexPart);
    }

    public static boolean integer(String str) {
        int p = 0;
        if (str.charAt(p) == '+' || str.charAt(p) == '-') {
            p++;
        }
        while (p != str.length()) {
            if (str.charAt(p) < '0' || str.charAt(p) > '9') {
                return false;
            }
            p++;
        }
        return true;
    }

    public static boolean decimal(String str) {
        int p = 0;
        while (p != str.length()) {
            if (str.charAt(p) < '0' || str.charAt(p) > '9') {
                return false;
            }
            p++;
        }
        return true;
    }

    public static boolean index(String str) {
        int p = 0;
        if (str.length() != 0 && (str.charAt(p) == '+' || str.charAt(p) == '-')) {
            p++;
        }
        while (p != str.length()) {
            if (str.charAt(p) < '0' || str.charAt(p) > '9') {
                return false;
            }
            p++;
        }
        return true;
    }
}

//这个题目应该还有很多奇怪的测试用例目前没有通过，不过核心已经完成，核心是将整数、小数、指数分开