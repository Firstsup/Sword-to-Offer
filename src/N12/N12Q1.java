package N12;

public class N12Q1 {
    public static void main(String[] args) {
        Character[][] arr = new Character[][]{{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'j', 'd', 'e', 'h'}};
        String str1 = "bfce";
        String str2 = "abfb";
        boolean tof = function(arr, str1);
        System.out.println(tof);
        tof = function(arr, str2);
        System.out.println(tof);
    }

    public static boolean function(Character[][] arr, String str) {
        int pathLength = 0;
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (coreFunction(arr, str, i, j, pathLength, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean coreFunction(Character[][] arr, String str, int row, int col, int pathLength, boolean[][] visited) {
        if (pathLength == str.length()) {
            return true;
        }
        boolean hasPath = false;
        if (arr[row][col] == str.charAt(pathLength) && !visited[row][col]) {
            pathLength++;
            visited[row][col] = true;
            if (row != 0) {
                hasPath = coreFunction(arr, str, row - 1, col, pathLength, visited);
            }
            if (col != arr[0].length - 1) {
                hasPath = hasPath || coreFunction(arr, str, row, col + 1, pathLength, visited);
            }
            if (row != arr.length - 1) {
                hasPath = hasPath || coreFunction(arr, str, row + 1, col, pathLength, visited);
            }
            if (col != 0) {
                hasPath = hasPath || coreFunction(arr, str, row, col - 1, pathLength, visited);
            }
            if (!hasPath) {
                visited[row][col] = false;
            }
        }
        return hasPath;
    }
}
