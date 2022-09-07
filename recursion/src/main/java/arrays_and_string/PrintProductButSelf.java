/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].



Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation:
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
Example 2:

Input:
n = 2
nums[] = {12,0}
Output:
0 12

 */

package arrays_and_string;

import java.util.Arrays;

public class PrintProductButSelf {
    public static void main(String[] args) {
        int[] arr = {12, 0};
        //int[] arr = {10, 3, 5, 6, 2}; //left [10 30 150 900 1800]        right [1800 180 60 12 2]
        System.out.println(Arrays.toString(productExceptSelf(arr, arr.length)));
    }

    public static long[] productExceptSelf(int[] nums, int n) {
        long[] op = new long[n];

        if (nums.length < 1) {
            return op;
        }
        op[0] = nums[0];
        for (int i = 1; i < n; i++) {
            op[i] = op[i - 1] * nums[i];
        }
        long prod = 1;
        for (int i = n - 1; i > 0; i--) {
            op[i] = op[i-1] *prod;
            prod = prod*nums[i];
        }
        op[0] = prod;
        return op;
    }
}
