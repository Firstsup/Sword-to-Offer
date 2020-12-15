package N16;

public class N16Q2 {
    public static void main(String[] args) {
        double base = 2;
        int exponent = -1;
        System.out.println(function(base, exponent));
    }

    public static double function(double base, int exponent) {
        if (base == 0 && exponent == 0) {
            System.out.println("illegal");
            return 1;
        }
        int negative = 0;
        if (exponent < 0) {
            exponent = -exponent;
            negative = 1;
        }
        double ret = coreFunction(base, exponent);
        if (negative == 1) {
            ret = 1 / ret;
        }
        return ret;
    }

    public static double coreFunction(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double ret = coreFunction(base, exponent >> 1);
        ret *= ret;
        if ((exponent & 1) == 1) {
            ret *= base;
        }
        return ret;
    }
}
