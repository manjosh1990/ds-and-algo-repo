/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class MaxSumCircularSubArray {
    public static void main(String[] args) {
        int[] arr = {-3, -18, -22, -21, -17, 16, -14, 28, -22}; //-5,3,2,-6,1,-4
        //int[] arr ={8,-8,9,-9,10,-11,12};
        System.out.println(circularSubArraySum(arr, arr.length));
    }

    static int circularSubArraySum(int[] a, int n) {

        // Your code here
       /* int[] newArr = new int[2 * n];
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (ind == n - 1) {
                newArr[ind] = a[i];
                i = -1;
            } else {
                newArr[ind] = a[i];
            }

            ind++;
        }*/
        //System.out.println(Arrays.toString(newArr));
        // System.out.println(kadane(a,n));
        // System.out.println(reverseKadane(a,n));
       // return kadane(newArr, newArr.length-1);
        int x = kadane(a,n);
        //total sum of elements
        int y =0;
        for(int i =0;i<n;i++){
            y+=a[i];
            a[i]*=-1;
        }
        int z = kadane(a,n);
        if(y+z==0) return x;

        return Math.max(x,y+z);
    }

    static int kadane(int[] a, int n) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < n; i++) {
            if (curSum < 0) {
                curSum = a[i];
            } else {
                curSum = curSum + a[i];
            }
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    static int reverseKadane(int[] a, int n) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (currSum < 0) {
                currSum = a[i];
            } else {
                currSum = currSum + a[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
