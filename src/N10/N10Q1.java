package N10;

import java.util.ArrayList;

public class N10Q1 {
    public static void main(String[] args) {
        System.out.println(function(10));
        System.out.println(function(11));
    }

    public static long function(int n) {
        ArrayList<Long> arr = new ArrayList<>();
        arr.add((long) 0);
        arr.add((long) 1);
        for (int i = 2; i <= n - 1; i++) {
            arr.add(arr.get(i - 2) + arr.get(i - 1));
        }
        return arr.get(n - 1);
    }
}
