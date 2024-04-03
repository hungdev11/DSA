public class NumOfPathReachLastCellWithCost {
    public int numberOfPath(int[][] arr, int row, int col, int cost) {
        if (cost < 0)
            return 0;
        if (row == 0 && col == 0) {
            if (cost - arr[row][col] == 0)
                return 1;
            else
                return 0;
        } else if (row == 0) {
            return numberOfPath(arr, row, col - 1, cost - arr[row][col]);
        } else if (col == 0) {
            return numberOfPath(arr, row - 1, col, cost - arr[row][col]);
        } else {
            int opt1 = numberOfPath(arr, row - 1, col, cost - arr[row][col]);
            int opt2 = numberOfPath(arr, row, col - 1, cost - arr[row][col]);
            return opt1 + opt2;
        }

    }
}