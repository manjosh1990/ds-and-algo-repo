/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 *
 *
 * Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself.

Example 1:

Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1,
second max = 5, second min = 2, and
so on... Modified array is : 6 1 5 2 4 3.
Example 2:

Input:
N = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10,
second max = 100, second min = 20, and
so on... Modified array is :
110 10 100 20 90 30 80 40 70 50 60.
*
* maxElem = arr[n-1] +1;
* arr[i] = arr[i] + (arr[max]%maxElem)*maxElem; in even case
*
* arr[i] = arr[i] + (arr[min]%maxElem)*maxElem; in odd case;
 */

package arrays_and_string;

import java.util.Arrays;

public class ArrangeSortedArrayAlternatively {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
       // long[] arr = {1,3,4,5,8,9};
        rearrange(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void rearrange(long[] arr, int n){

        // Your code here
        long maxElem = arr[n-1] +1;
        int min =0;
        int max = n-1;

        for(int i =0;i<n;i++){
            if(i%2==0){
                //even
                arr[i] = arr[i] +(arr[max] % maxElem)*maxElem;
                max--;
            }else{
                //odd
                arr[i] = arr[i] +(arr[min] % maxElem)*maxElem;
                min++;
            }
        }
        for(int i =0;i<n;i++){
            arr[i] = arr[i]/maxElem;
        }

    }
}
