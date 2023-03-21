class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != '0' ) {
                    numIslands(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void numIslands(char[][] grid, int m, int n) {
        if(m >= grid.length || n >= grid[0].length || m < 0 || n < 0 || grid[m][n] == '0') {
            return ;
        }
        grid[m][n] = '0';
        numIslands( grid, m+1, n);
        numIslands( grid, m-1, n);
        numIslands( grid, m, n+1);
        numIslands( grid, m, n-1);
    }
}