public class N3Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 2, 5, 3};
        arr = function(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            } else {
                break;
            }
        }
    }

    public static int[] function(int[] arr) {
        int[] ret = new int[]{-1, -1, -1, -1, -1, -1, -1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                if (arr[arr[i]] != arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                    i--;
                } else {
                    ret[count] = arr[i];
                    count++;
                }
            }
        }
        return ret;
    }
}