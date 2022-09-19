/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class MinimumSwapsKTogether {
    public static void main(String[] args) {
       int[] arr = {2, 1, 5, 6, 3};
       int k=3;
        System.out.println(minSwap(arr,arr.length,k));
    }
    public static int minSwap (int[] arr, int n, int k) {
        //Complete the function

        //count bad numbers
        int count =0;
        for(int i : arr){
            if(i<=k) count++;
        }
        int bad = 0;
        int i =0;
        int j =0;
        while (j<count){
            if(arr[j] >k){
                bad++;
            }
            j++;
        }
        j = count;
        int ans = bad;
        while (j<n){
            if(arr[i] >k){
                bad--;
            }

            if(arr[j] >k){
                bad++;
            }
            j++;
            i++;
            ans = Math.min(ans,bad);
        }

        return ans;
    }
}
