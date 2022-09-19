/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class BitonicPoint {
    public static void main(String[] args) {
      // int[] arr = {1,15,25,45,42,21,17,12,11};//
       //int[] arr = {1,3000,2};
        int[] arr={1,45,47,50,5};
        System.out.println(findMaximum(arr,arr.length));
    }
    static  int findMaximum(int[] arr, int n) {
        // code here
        int low =0;
        int high =n-1;
        while (low<high){
            int mid = (high+low)/2;
            if(arr[mid-1] < arr[mid] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid] < arr[mid+1]){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        if(low==n-1) return arr[n-1];
        return -1;
    }
}
