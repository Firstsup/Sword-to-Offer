package N14;

public class N14Q1 {
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
        int[] arr = new int[length + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        int max;
        for (int i = 4; i <= length; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int temp = arr[j] * arr[i - j];
                if (temp > max) {
                    max = temp;
                }
            }
            arr[i] = max;
        }
        return arr[length];
    }
}
