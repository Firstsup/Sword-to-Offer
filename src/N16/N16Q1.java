package N16;

public class N16Q1 {
    public static void main(String[] args) {
        double base = 2;
        int exponent = -1;
        System.out.println(function(base, exponent));
    }

    public static double function(double base, int exponent) {
        if (base == 0 && exponent == 0) {
            System.out.println("illegal");
            return 0;
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
        double ret = 1;
        for (int i = 0; i < exponent; i++) {
            ret *= base;
        }
        return ret;
    }
}
