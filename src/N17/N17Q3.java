package N17;

public class N17Q3 {
    public static void main(String[] args) {
        char[] m = new char[]{'-', '9', '9', '8'};
        char[] n = new char[]{'1', '0', '2', '4'};
        function(m, n);
    }

    public static void function(char[] m, char[] n) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag = true;
        if (m[0] == '-') {
            flag1 = false;
        }
        if (n[0] == '-') {
            flag2 = false;
        }
        int[] num1 = new int[m.length - (flag1 ? 0 : 1)];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = (int) m[i + (flag1 ? 0 : 1)] - 48;
        }
        int[] num2 = new int[n.length - (flag2 ? 0 : 1)];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = (int) n[i + (flag2 ? 0 : 1)] - 48;
        }
        int[] num = new int[Math.max(m.length, n.length) + 1];
        coreFunction(num, num1, num2, flag, flag1, flag2);
    }

    public static void coreFunction(int[] num, int[] num1, int[] num2, boolean flag, boolean flag1, boolean flag2) {
        if (flag1 == flag) {
            increase(num, num1);
        } else {
            flag = decrease(num, num1, flag, flag1);
        }
        if (flag2 == flag) {
            increase(num, num2);
        } else {
            flag = decrease(num, num2, flag, flag2);
        }
        printNumber(num, flag);
    }

    public static void increase(int[] num, int[] num0) {
        while (!numEqualZero(num0)) {
            increaseOne(num);
            decreaseOne(num0);
        }
    }

    public static boolean decrease(int[] num, int[] num0, boolean flag, boolean flag0) {
        boolean change = false;
        while (!numEqualZero(num0)) {
            if (!change) {
                decreaseOne(num);
            } else {
                increaseOne(num);
            }
            if (numEqualZero(num)) {
                change = true;
                flag = !flag;
            }
            decreaseOne(num0);
        }
        return flag;
    }

    public static void increaseOne(int[] num) {
        num[num.length - 1]++;
        for (int i = num.length - 1; i > 0; i--) {
            if (num[i] == 10) {
                num[i - 1]++;
                num[i] -= 10;
            }
        }
    }

    public static void decreaseOne(int[] num) {
        num[num.length - 1]--;
        for (int i = num.length - 1; i > 0; i--) {
            if (num[i] == -1) {
                num[i - 1]--;
                num[i] += 10;
            }
        }
    }

    public static boolean numEqualZero(int[] num) {
        boolean swi = true;
        for (int j : num) {
            if (j != 0) {
                swi = false;
                break;
            }
        }
        return swi;
    }

    public static void printNumber(int[] num, boolean flag) {
        if (!flag && !numEqualZero(num)) {
            System.out.print('-');
        }
        boolean swi = false;
        for (int j : num) {
            if (j != 0) {
                swi = true;
            }
            if (swi) {
                System.out.print(j);
            }
        }
        System.out.println();
    }
}

//这个是迄今为止最复杂的算法，很有挑战性！