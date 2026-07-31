class Solution 
{
    public int numIslands(char[][] grid) 
    {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (grid[i][j] == '1')
                {
                    dfs(i, j, grid);
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void dfs(int i, int j, char[][] grid)
    {
        if (i < 0 || j < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == '0')
        {
            return;
        }
        grid[i][j] = '0';
        dfs(i - 1, j, grid);
        dfs(i, j - 1, grid);
        dfs(i + 1, j, grid);
        dfs(i, j + 1, grid);
    }
}
