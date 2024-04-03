public class MinimumCostToLastCell {
    private int findMinCost(int[][] arr, int row, int col) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) {
            return arr[row][col];
        } else {
            int opt1 = findMinCost(arr, row - 1, col);
            int opt2 = findMinCost(arr, row, col - 1);
            return arr[row][col] + Math.min(opt1, opt2);
        }
    }

    public int findMinCostLength(int[][] arr) {
        return findMinCost(arr, arr.length - 1, arr[0].length - 1);
    }
}
