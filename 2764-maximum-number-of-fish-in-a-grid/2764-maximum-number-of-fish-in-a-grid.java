class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        // Main loop to find the maximum fish
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > 0 && !visited[r][c]) {
                    maxFish = Math.max(maxFish, dfs(grid, visited, directions, r, c));
                }
            }
        }
        
        return maxFish;
    }

    // DFS function to explore the connected component
    private int dfs(int[][] grid, boolean[][] visited, int[][] directions, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base conditions
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] <= 0 || visited[r][c]) {
            return 0;
        }

        // Mark the cell as visited
        visited[r][c] = true;

        int fish = grid[r][c];

        // Explore all four directions
        for (int[] dir : directions) {
            fish += dfs(grid, visited, directions, r + dir[0], c + dir[1]);
        }

        return fish;
    }
}
