package N17;

public class N17Q1 {
    public static void main(String[] args) {
        int n = 3;
        function(n);
    }

    public static void function(int n) {
        int[] num = new int[n];
        boolean overflow = false;
        while (!overflow) {
            increaseNumber(num);
            overflow = printNumber(num);
        }
    }

    public static void increaseNumber(int[] num) {
        num[num.length - 1]++;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] == 10) {
                num[i - 1]++;
                num[i] -= 10;
            }
        }
    }

    public static boolean printNumber(int[] num) {
        int number = 0;
        for (int i = 0; i < num.length; i++) {
            number += num[i] * Math.pow(10, (num.length - i - 1));
        }
        System.out.println(number);
        return number == Math.pow(10, num.length) - 1;
    }
}
