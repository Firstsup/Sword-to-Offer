package N14;

public class N14Q2 {
    public static void main(String[] args) {
        int length = 8;
        System.out.println(function(length));
    }

    public static int function(int length) {
        if (length <= 1) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int times1 = length / 3;
        if (length - times1 * 3 == 1) {
            times1 -= 1;
        }
        int times2 = (length - times1 * 3) / 2;
        return (int) Math.pow(3, times1) * (int) Math.pow(2, times2);
    }
}
