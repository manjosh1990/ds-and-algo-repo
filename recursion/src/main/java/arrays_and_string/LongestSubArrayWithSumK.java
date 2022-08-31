/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] A = {10, 5, 2, 7, 1, 9};//10 15 17 24 25 34 || 10-0, 15-1, 17-2, 24-3,25-4
       // int[] A = {15,-2,2,-8,1,7,10,23};
        int K =15;
        int N = A.length;
        System.out.println(lenOfLongSubarr(A,N,K));
    }

    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int sum=0;
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<N;i++){
            sum+=A[i];
            if(sum == K){
                ans =i+1;
            } else if (map.containsKey(sum -K)) {
                ans = Math.max(i-map.get(sum-K),ans);
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return ans;
    }
}
