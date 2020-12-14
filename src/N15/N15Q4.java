package N15;

public class N15Q4 {
    public static void main(String[] args) {
        int m = 10;
        int n = 13;
        System.out.println(function(m, n));
    }

    public static int function(int m, int n) {
        int k = m ^ n;
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((k & flag) != 0) {
                count++;
            }
            flag <<= 1;
        }
        return count;
    }
}
