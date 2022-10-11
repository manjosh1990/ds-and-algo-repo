/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.List;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] A = {{1,1},{0,1},{3,3},{3,4}};
        int n=4;
        int m =5;
        System.out.println(numOfIslands(n,m,A));
    }
    public static List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        //Your code here
        int[][] mat = new int[rows][cols];
        List<Integer> ans = new ArrayList<>();
        //fill matrix

        for(int[] indx : operators){
            int x = indx[0];
            int y = indx[1];
            mat[x][y]=1;
            int[][] temp = new int[rows][cols];
            int count =0;
            for(int i =0;i<mat.length;i++){
                for(int j =0;j<mat[0].length;j++){
                    if(mat[i][j]==1 && temp[i][j]==0){
                        markCurrentIsland(mat,temp,i,j,rows,cols);
                        count+=1;
                    }
                }
            }
            ans.add(count);
        }


        return ans;
    }
    public static void markCurrentIsland(int[][] grid,int[][]visited, int x,int y, int r, int c){
        if(x<0 || x>=r || y<0 ||y>=c || grid[x][y]!=1 || visited[x][y]==1) return;
        visited[x][y]=1;
        markCurrentIsland(grid,visited,x+1,y,r,c);//down
        markCurrentIsland(grid,visited,x,y+1,r,c);//right
        markCurrentIsland(grid,visited,x-1,y,r,c);//top
        markCurrentIsland(grid,visited,x,y-1,r,c);//left
    }
}
