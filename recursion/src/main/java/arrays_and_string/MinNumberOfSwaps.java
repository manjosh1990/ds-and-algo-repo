/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.


Example 1:

Input:
nums = {2, 8, 5, 4}
Output:
1
Explaination:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explaination:
swap 10 with 3 and swap 19 with 5.
 */

package arrays_and_string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinNumberOfSwaps {
    public static void main(String[] args) {
        int[] nums = {10, 19, 6, 3, 5};
        System.out.println(minSwaps(nums));
    }

    public static int minSwaps(int[] nums)
    {
        // Code here
        int count =0;
        Map<Integer,Integer> index = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            index.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            int idx = index.get(nums[i]);
            if(i != idx){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                count++;
                i--;
            }
        }
        return count;
    }
}
