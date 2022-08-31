/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class FindTriplets {
    public static void main(String[] args) {

        //int []arr = {0, -1, 2, -3, 1};
        int[] arr = {1, 2, 3};
        System.out.println(findTriplets(arr, arr.length, 0));

        System.out.println(11^1);
    }

    public static boolean findTriplets(int[] arr, int n, int sum) {
        //add code here. time : O(n2), space: O(1)
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int low = i + 1;
            int high = n - 1;
            int y = sum - arr[i];
            while (low < high) {
                if (arr[low] + arr[high] == y) {
                    return true;
                }
                if (arr[low] + arr[high] > y) {
                    high--;
                } else low++;
            }
        }

        return false;
    }
}
