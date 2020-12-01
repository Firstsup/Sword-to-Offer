package N5;

public class N5Q2 {
    public static void main(String[] args) {
        int[] a1 = new int[]{0, 2, 4, 6, 8, -1, -1, -1, -1, -1};
        int[] a2 = new int[]{1, 3, 5, 7, 9};
        function(a1, a2);
        for (int j : a1) {
            System.out.print(j + " ");
        }
    }

    public static void function(int[] a1, int[] a2) {
        int p = 0;
        int q = a2.length - 1;
        int r = a1.length - 1;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == -1) {
                p = i - 1;
                break;
            }
        }
        while (r >= 0) {
            if (p < 0) {
                for (int i = q; i >= 0; i--) {
                    a1[r] = a2[q];
                    r--;
                    q--;
                }
            } else if (q < 0) {
                for (int i = p; i >= 0; i--) {
                    a1[r] = a1[p];
                    r--;
                    p--;
                }
            } else if (a1[p] >= a2[q]) {
                a1[r] = a1[p];
                p--;
            } else {
                a1[r] = a2[q];
                q--;
            }
            r--;
        }
    }
}
