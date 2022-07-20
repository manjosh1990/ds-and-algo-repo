/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class KadanesAlgo {
    public static void main(String[] args) {
       int[] arr = {1,2,3,-2,5};
        System.out.println(largestContiguousSum(arr));
        String s = "abs";
        System.out.println(s.length());
    }
    public static long largestContiguousSum(int[] arr) {
        long maxSum = Long.MIN_VALUE;
        long currSum =0;
        for (int j : arr) {
            if (currSum < 0) {
                currSum = j;
            } else {
                currSum = currSum + j;
            }
            maxSum = Long.max(maxSum, currSum);
        }
        return maxSum;
    }
}
