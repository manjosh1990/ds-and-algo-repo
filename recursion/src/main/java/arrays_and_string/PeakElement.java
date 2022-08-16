/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class PeakElement {


    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int left =0;
        int right = n-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 15, 19 ,9 ,13 ,12 ,6 ,7 ,2, 10 ,4, 1 ,14, 11, 14, 14, 13};
        System.out.println(peakElement(arr,arr.length));
    }
}
