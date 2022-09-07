/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        //int [] arr = {1, 2, 3, 4};
        //int[] arr = {7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};
        System.out.println(firstRepeated(arr, arr.length));
    }

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int min = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
                min = i + 1;
            }
        }
        return min;
    }
}
