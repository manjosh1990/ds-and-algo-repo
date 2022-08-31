/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 *
 * Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

Example 1:

Input:
m = 6, n = 6
arr1[] = {1,2,3,4,7,9}
arr2[] = {0,1,2,1,1,4}
Output: 4 5 5 6 6 6
Explanation: Number of elements less than
or equal to 1, 2, 3, 4, 7, and 9 in the
second array are respectively 4,5,5,6,6,6
 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingElementsInTwoArrays {

    public static void main(String[] args) {
        /*int[] arr1 = {1,2,3,4,7,9};
        int[] arr2 = {0,1,2,1,1,4};*/

        int arr1[] = {4,8,7,5,1};
        int arr2[] = {4,48,3,0,1,1,5}; //Output: 5 6 6 6 3
        System.out.println(countEleLessThanOrEqual(arr1,arr2,arr1.length,arr2.length));
    }

    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr2);
       /* System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));*/
        for(int i =0; i<m;i++){
            list.add(getTransitionIndex(arr1[i],arr2));
        }
        return list;
    }

    static int getTransitionIndex(int key,int[] arr){
        int low =0;
        int high = arr.length;

        while (low <high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > key){
                high =mid;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}
