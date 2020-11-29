package N4;

public class N4Q1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int find = 7;
        boolean tof = function(arr, find);
        System.out.println(tof);
    }

    public static boolean function(int[][] arr, int find) {
        int x = 0;
        int y = arr[0].length - 1;
        while (arr[x][y] != find) {
            if (arr[x][y] < find) {
                x++;
                if (x == arr.length) {
                    return false;
                }
            } else {
                y--;
                if (y == -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
