/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input:
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).
 */

package arrays_and_string;

public class RowWithMaxOnes {
    public static void main(String[] args) {
        /*int[][] arr = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};*/

        int[][] arr ={{0, 0}, {0,1}};
        System.out.println(rowWithMax1s(arr, arr.length, arr[0].length));
    }

    static int rowWithMax1s(int[][] arr, int n, int m) {
        // code here
        int result = -1;
        int count = m-1;
        int pos = m-1;
        for (int i = 0; i < n; i++) {
            if (count >= 0) {
                pos = getStartPosition(arr[i], count);
            }

            if (pos < count) {
                count = pos;
                result = i;
            }
        }
        return result;
    }

    static int getStartPosition(int[] arr, int uIndex) {
        int j = uIndex;
        while (j >= 0 && arr[j] > 0) {
            j--;
        }
        return j;
    }
}
