package N15;

public class N15Q2 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(function(n));
    }

    public static int function(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
