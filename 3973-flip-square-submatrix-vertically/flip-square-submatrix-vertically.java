class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int sr = x;
        int er = x + k - 1;

        int sc = y;
        int ec = y + k - 1;

        for (int i = sr; i <= er; i++) {
            for (int j = sc; j <= ec; j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[er][j];
                grid[er][j] = temp;
            }
            er--;
        }
        return grid;
    }
}