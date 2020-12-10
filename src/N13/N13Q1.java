package N13;

public class N13Q1 {
    public static void main(String[] args) {
        int rows = 20;
        int cols = 20;
        int k = 15;
        System.out.println(function(rows, cols, k));
    }

    public static int function(int rows, int cols, int k) {
        boolean[][] visited = new boolean[rows][cols];
        return coreFunction(rows, cols, 0, 0, k, visited);
    }

    public static int coreFunction(int rows, int cols, int row, int col, int k, boolean[][] visited) {
        int count = 0;
        if (check(rows, cols, row, col, k, visited)) {
            visited[row][col] = true;
            count = 1 + coreFunction(rows, cols, row - 1, col, k, visited) + coreFunction(rows, cols, row, col + 1, k, visited) + coreFunction(rows, cols, row + 1, col, k, visited) + coreFunction(rows, cols, row, col - 1, k, visited);
        }
        return count;
    }

    public static boolean check(int rows, int cols, int row, int col, int k, boolean[][] visited) {
        return row < rows && col < cols && row >= 0 && col >= 0 && !visited[row][col] && digitSum(row, col) <= k;
    }

    public static int digitSum(int row, int col) {
        int sum = 0;
        while (row > 0) {
            sum += row % 10;
            row /= 10;
        }
        while (col > 0) {
            sum += col % 10;
            col /= 10;
        }
        return sum;
    }
}
