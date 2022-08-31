/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 *
 * Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be
rearranged to {0,1,2,4,5}
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class FindIfTwoArraysAreEqual {
    public static void main(String[] args) {
        long[] A = {445, 627, 523, 466, 709, 417, 283, 259, 925, 638, 63, 625, 601, 37, 453, 900, 380, 551, 469, 72, 974, 132, 882, 931, 934, 895, 661, 164, 200, 982, 900, 997, 960, 774, 814, 669, 191};
        long[] B = {709, 900, 469, 37, 283, 417, 259, 132, 974, 814, 551, 466, 982, 627, 63, 669, 934, 625, 661, 960, 601, 380, 523, 200, 900, 191, 895, 774, 72, 997, 638, 931, 445, 925, 453, 164, 882};
        System.out.println(check(A, B, A.length));
    }

    public static boolean check(long[] A, long[] B, int N) {
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long elm = A[i];
            if (map.containsKey(elm)) {
                int count = map.get(elm);
                map.put(elm, count + 1);
            } else {
                map.put(elm, 1);
            }
        }
        for (int i = 0; i < N; i++) {
            long elm = B[i];
            if(map.containsKey(elm)){
                int count = map.get(elm);
                if(count >1){
                    map.put(elm,count-1);
                }else {
                    map.remove(elm);
                }
            }else{
                return false;
            }
        }
        if(!map.isEmpty()) return false;

        return true;
    }
}
