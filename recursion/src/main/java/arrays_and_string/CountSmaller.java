/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSmaller {
    public static void main(String[] args) {
        int[] input = {12, 1, 2, 3, 0, 11, 4};
        int n = input.length;
        int[] ans = new int[n];
        List<Integer> sorted = new ArrayList<>();
        sorted.add(input[n - 1]);
        int x = n - 2;
        for (int i = n - 2; i >= 0; i--) {
            int index = findIndex(sorted,input[i],0,sorted.size()-1);
            sorted.add(index,input[i]);
            ans[x] = index;
            x--;
        }
        System.out.println(Arrays.toString(ans));
    }

    //finds index using binary search
    static int findIndex(List<Integer> sorted, int key, int low, int high) {
        if (low > high) return low;
        int mid = low + (high - low) / 2;
        if (sorted.get(mid) >= key) {
            return findIndex(sorted, key, low, mid - 1);
        } else {
            return findIndex(sorted, key, mid + 1, high);
        }
    }
}
