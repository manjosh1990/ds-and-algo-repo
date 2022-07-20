/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class KthSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 20, 15};
        System.out.println(kthSmallest(arr,4-1,0,arr.length-1));
    }
    static int kthSmallest(int[] arr, int k, int low, int high){
        /*if(low == high){
            return arr[low];
        }*/
        int partition = partitionAndReturnCorrectPivot(arr,low,high);
        if(partition == k) return arr[partition];
        if(partition < k){
            return kthSmallest(arr,k,partition+1, high);
        }else{
            return kthSmallest(arr,k,low,partition-1);
        }
    }
    static int partitionAndReturnCorrectPivot(int[] arr, int left, int right) {
        int pivot = arr[right];
        int pivotLocation = left;
        for (int i = left; i <= right; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pivotLocation];
                arr[pivotLocation] = temp;
                pivotLocation++;
            }
        }
        int temp = arr[right];
        arr[right] = arr[pivotLocation];
        arr[pivotLocation] = temp;
        return pivotLocation;
    }
}
