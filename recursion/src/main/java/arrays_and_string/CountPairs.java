/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(countPairs(arr,arr.length,2));
    }

    private static int countPairs(int[] arr, int n, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i =0;i<n;i++){
            int diff = k - arr[i];
            if(map.containsKey(diff)){
                count = count + map.get(diff);
            }
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        return count;
    }
}
