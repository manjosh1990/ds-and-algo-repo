/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5};
        //int[] arr = {40,13,27,87,95,40,96,71,35,79,68,2,98,3,18,93,53,57,2,81,87,42,66,90,45,20,41,30,32,18,98,72,82,76,10,28,68,57,98,54,87,66,7,84,20,25,29,72,33,30,4,20,71,69,9,16,41,50,97,24,19,46,47,52,22,56,80,89,65,29,42,51,94,1,35,65};
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        //System.out.println(Arrays.toString(result));
        rotateArr(arr,3,arr.length);
    }
    static void rotateArr(int[] arr, int d, int n)
    {
        // add your code here
        d = d % n;
        reverse(arr,0,n-d-1);
       // System.out.println(Arrays.toString(arr));
        reverse(arr,n-d,n-1);
       // System.out.println(Arrays.toString(arr));
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int left, int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
