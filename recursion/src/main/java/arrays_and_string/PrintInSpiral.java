/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;

public class PrintInSpiral {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        System.out.println(spirallyTraverse(mat, mat.length, mat[0].length));
    }

    static ArrayList<Integer> spirallyTraverse(int[][] mat, int r, int c) {
        ArrayList<Integer> result = new ArrayList<>();
        if (mat == null || mat.length == 0) return result;
        int top = 0;
        int left = 0;
        int bottom = r-1;
        int right = c-1;

        int size = r * c;
        while (result.size() < size) {
            //traverse from left to right
            for(int i = left;i<= right && result.size() < size;i++){
                result.add(mat[top][i]);
            }
            top++;
            //traverse from top to bottom
            for(int i =top;i<=bottom && result.size() < size;i++){
                result.add(mat[i][right]);
            }
            right--;
            //traverse from right to left
            for(int i=right;i>=left && result.size() < size;i--){
                result.add(mat[bottom][i]);
            }
            bottom--;
            //traverse bottom to top
            for(int i =bottom;i>=top && result.size() < size;i--){
                result.add(mat[i][left]);
            }
            left++;
        }
        return result;
    }
}
