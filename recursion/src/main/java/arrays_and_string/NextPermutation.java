/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4};
        System.out.println(nextPermutation(arr.length,arr));
    }
    static List<Integer> nextPermutation(int N, int[] arr){
        int idx =-1;
        //find number which is less than current element from last;
        for(int i=N-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                idx =i;
                break;
            }
        }
        //no number found then arrange in ascending order or sort
        if(idx ==-1){
            Arrays.sort(arr);
        }else{
            int prev = idx;
            //find the next greatest number than idx-1
            for(int i = idx+1;i<N;i++){
                if(arr[idx-1] <arr[i] && arr[prev]>=arr[i]){
                    prev =i;
                }
            }
            //swap idx-1 and next greater number
            int temp = arr[prev];
            arr[prev] = arr[idx-1];
            arr[idx-1]=temp;
            //reverse from idx to end of the array
            int j = N-1;
            while (idx<j){
                 temp = arr[j];
                 arr[j] = arr[idx];
                 arr[idx]=temp;
                 idx++;
                 j--;
            }
        }

        List<Integer> intList = new ArrayList<>(arr.length);
        for (int i : arr)
        {
            intList.add(i);
        }
        return intList;
    }
}
