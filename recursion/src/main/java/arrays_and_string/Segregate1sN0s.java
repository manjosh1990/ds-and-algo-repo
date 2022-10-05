/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class Segregate1sN0s {
    public static void main(String[] args) {
      int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
   static void segregate0and1(int[] arr, int n) {
        // code here
       int start =0;
       int end = n-1;
       int i =0;

       while (i<=end){
           if(arr[i] <1){
               int temp = arr[i];
               arr[i] = arr[start];
               arr[start] =temp;
               i++;
               start++;
           } else if (arr[i]>0) {
               int temp = arr[i];
               arr[i] = arr[end];
               arr[end]=temp;
               end--;
           }else{
               i++;
           }
       }
    }
}
