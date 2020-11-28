package N3;

public class N3Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 4, 3, 2, 6, 7};
        int ret = function(arr);
        System.out.println(ret);
    }

    public static int function(int[] arr) {
        int low = 1;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            int countl = 0, counth = 0;
            for (int j : arr) {
                if (j >= low && j <= mid) {
                    countl++;
                } else if (j > mid && j <= high) {
                    counth++;
                }
            }
            if (countl > (mid - low + 1)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
