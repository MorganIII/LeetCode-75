class Solution {
    public int uniquePaths(int m, int n) {
        int count = 0;
        int[][] grid = new int[m][n];
        return uniquePathsHelper(m-1,n-1,count,grid);
    }
    public int uniquePathsHelper(int m, int n,int count, int[][] grid) {
        if (m < 0 || n < 0) return count;
        if(grid[m][n] != 0) return grid[m][n];
        if(m == 0 && n == 0) {
            return ++count;
        }

        count = uniquePathsHelper(m-1,n,count,grid) + uniquePathsHelper(m,n-1,count,grid);
        grid[m][n] = count;
        return count;
    }
}
