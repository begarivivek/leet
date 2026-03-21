class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int sr = x;
        int er = x + k - 1;

        int sc = y;
        int ec = y + k - 1;

        while(sr<er) {
            for (int j = sc; j <= ec; j++) {
                int temp = grid[sr][j];
                grid[sr][j] = grid[er][j];
                grid[er][j] = temp;
            }
            sr++;
            er--;
        }
        return grid;
    }
}