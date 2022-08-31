/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.


Example 1:

Input:
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.


 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatePosNegNumber {

    public static void main(String[] args) {
        //int[] arr = {-5 ,-2 ,5 ,2 ,4 ,7 ,1 ,8 ,0 ,-8};
        int[] arr = {-36, -9, -92, -87, -43, -44};
        rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rearrange(int arr[], int N) {
        // code here

        //O(N)
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }

        int n = 0;
        int p = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (p < pos.size()) {
                    arr[i] = pos.get(p++);
                } else {
                    arr[i] = neg.get(n++);
                }
            } else {
                if (n < neg.size()) {
                    arr[i] = neg.get(n++);
                } else {
                    arr[i] = pos.get(p++);
                }
            }
        }
    }

    static void reArrange(int[] arr){

    }
}
