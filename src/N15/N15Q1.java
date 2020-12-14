package N15;

public class N15Q1 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(function(n));
    }

    public static int function(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag <<= 1;
        }
        return count;
    }
}
