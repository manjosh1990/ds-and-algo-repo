/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class TwoRepeated {
    public static void main(String[] args) {
        int[] array = {1,2,1,3,4,3};
        System.out.println(Arrays.toString(twoRepeated(array,array.length)));
    }
    public static int[] twoRepeated(int arr[], int N)
    {
        // Your code here
        int[] ans= new int[2];
        int count =0;
        for(int i=0;i<N;i++){
            int elm = arr[i];
            int ind = Math.abs(elm) -1;

            if(arr[ind] <0){
                ans[count] = elm;
                count++;
            }else{
                arr[ind] = arr[ind]*-1;
            }

        }

        return ans;
    }
}
