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
        int[] num2 = new int[n.length - (flag2 ? 0 : 1)];
        int[] num = new int[Math.max(m.length, n.length)];
    }
}
