/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class SmallestContigousSum {
    public static void main(String[] args) {
        int[] arr ={3,-4, 2,-3,-1, 7,-5};
        System.out.println(smallestSumSubarray(arr,arr.length));
    }
    static int smallestSumSubarray(int[] arr, int size)
    {
        // your code here
        int minSum = Integer.MAX_VALUE;
        int currSum =0;
        for (int j : arr) {
            if (currSum > 0) {
                currSum = j;
            } else {
                currSum = currSum + j;
            }
            minSum = Integer.min(minSum, currSum);
        }
        return minSum;
    }
}
