package N11;

public class N11Q1 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 1, 2};
        int[] b = new int[]{1, 0, 1, 1, 1};
        System.out.println(function(a));
        System.out.println(function(b));
    }

    public static int function(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (arr[low] >= arr[high]) {
            if (high - low == 1) {
                mid = high;
                break;
            }
            mid = (low + high) / 2;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                return searchMin(arr, low, high);
            }
            if (arr[mid] >= arr[low]) {
                low = mid;
            } else if (arr[mid] <= arr[high]) {
                high = mid;
            }
        }
        return arr[mid];
    }

    public static int searchMin(int[] arr, int low, int high) {
        int min = arr[low];
        for (int i = low + 1; i < high; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
