/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class MinimizeHeights {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        System.out.println(getMinDiff(arr,arr.length,2));
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        //Sort the array.
        Arrays.sort(arr);

        //initialize result;
        int ans = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            int X = arr[i - 1];
            int Y = arr[i];
            if (arr[i] > k) {
                int maxElem = Math.max(X + k, arr[n - 1] - k);
                int minElem = Math.min(Y - k, arr[0] + k);
                int diff = maxElem - minElem;
                ans = Math.min(ans, diff);
            }
        }

        return ans;
    }
}
