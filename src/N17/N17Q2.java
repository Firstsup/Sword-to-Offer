package N17;

public class N17Q2 {
    public static void main(String[] args) {
        int n = 3;
        function(n);
    }

    public static void function(int n) {
        int[] num = new int[n];
        coreFunction(num, 0);
    }

    public static void coreFunction(int[] num, int point) {
        if (point == num.length) {
            printNumber(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            num[point] = i;
            coreFunction(num, point + 1);
        }
    }

    public static void printNumber(int[] num) {
        int count = 0;
        boolean swi = false;
        for (int j : num) {
            if (j != 0) {
                swi = true;
            }
            if (swi) {
                System.out.print(j);
            }
            if (j == 9) {
                count++;
            }
        }
        System.out.println();
    }
}
