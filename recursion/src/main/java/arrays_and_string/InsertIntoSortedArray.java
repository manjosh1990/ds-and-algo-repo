/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.List;

public class InsertIntoSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] =0;
        arr[3] =4;
        int insert = 4;
        int index = binarySearch(arr,insert,0,arr.length-1);
        System.out.println(index);

    }

    //returns index of the new number
    static int binarySearch(int[]arr, int key, int low, int high){
        if(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= key) {
                return binarySearch(arr, key, low, mid - 1);
            } else {
                return binarySearch(arr, key, mid + 1, high);
            }
        }
        return low;
    }
}
