/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class CountZeros {
    public static void main(String[] args) {
        //int[] arr ={1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        //int [] arr = {0, 0, 0, 0, 0};
        //int [] arr = {1,1,1,1,1,1};
        int[] arr ={1};
        System.out.println(countZeroes(arr,arr.length));
    }
    static int countZeroes(int[] arr, int n) {
        // code here
        int low =0;
        int high = n;
        int start = 0;
        while (low<high){
            int mid = (low+high)/2;
            if(arr[mid]>0){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return n-low;
    }
}
