/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class TransitionPoint {
    public static void main(String[] args) {

       // int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        //int[] arr ={0,0,0,1,1};
        int[] arr ={0};
        System.out.println(transitionPoint(arr,arr.length));
    }

    static  int transitionPoint(int arr[], int n) {
        // code here
        int low = 0;
        int high = n-1;

        while(low<high){
            int mid = (low + high)/2;

            if(arr[mid] >0){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        if(low ==0 && arr[0] <1) return -1;

        return low;
    }
}
