/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 *
 *
 *
 * Given a n * m matrix grid where each element can either be 0 or 1. You need to find the shortest distance between a given source cell to a destination cell. The path can only be created out of a cell if its value is 1.

If the path is not possible between source cell and destination cell, then return -1.

Note : You can move into an adjacent cell if that adjacent cell is filled with element 1. Two cells are adjacent if they share a side. In other words, you can move in one of the four directions, Up, Down, Left and Right.

Example 1:

Input:
grid[][] = {{1, 1, 1, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0},
            {1, 0, 0, 1}}
source = {0, 1}
destination = {2, 2}
Output:
3
Explanation:
1 1 1 1
1 1 0 1
1 1 1 1
1 1 0 0
1 0 0 1
The highlighted part in the matrix denotes the
shortest path from source to destination cell.
 */

package dynamic_programming;

public class ShortestDistance {


    public static void main(String[] args) {
        ShortestDistance shortestDistance = new ShortestDistance();
        int[][] grid = {{1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {1, 0, 0, 1}};
        int[] source = {0, 1};
        int[] destination = {2, 2};
        System.out.println(shortestDistance.shortestPath(grid, source, destination));
    }

    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        int[][] dp = new int[grid.length][grid[0].length];
        int ans = dfs(grid, source[0], source[1], destination[0], destination[1], 0,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    //does not work with DP
    int dfs(int[][] grid, int i, int j, int x, int y, int dis,int[][] dp) {

        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j] != 0) return dp[i][j];
        if (i == x && j == y) {
            return dis;
        }
        int ans = Integer.MAX_VALUE;
        grid[i][j] = 0;
        ans = Math.min(ans, dfs(grid, i + 1, j, x, y, dis + 1,dp));
        ans = Math.min(ans, dfs(grid, i, j + 1, x, y, dis + 1,dp));
        ans = Math.min(ans, dfs(grid, i - 1, j, x, y, dis + 1,dp));
        ans = Math.min(ans, dfs(grid, i, j - 1, x, y, dis + 1,dp));

        grid[i][j] = 1;
        dp[i][j] = ans;
        return dp[i][j];
    }
}
