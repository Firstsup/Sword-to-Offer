package N15;

public class N15Q3 {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(function(n));
    }

    public static boolean function(int n) {
        return (n & (n - 1)) == 0;
    }
}
