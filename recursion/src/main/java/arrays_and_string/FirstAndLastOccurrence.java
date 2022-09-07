/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
       // long[] arr ={6 ,9};
        int searchKey= 5;
        /*long[] arr = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        int searchKey =7;*/
        System.out.println(find(arr,arr.length,searchKey));
    }
   static ArrayList<Long> find(long[] arr, int n, int x)
    {
        // code here
        ArrayList<Long> result = new ArrayList<>();
        int left =0;
        int right =n;
        int mid =-1;
        long first =-1;
        long second =-1;
        while (left<right){
            mid = left + (right-left)/2;
            if(arr[mid] < x){
                left = mid+1;
            }else{
                right=mid;
            }
        }
        if(left<n && arr[left] == x){
            first =left;
        }
        left =0;
        right=n;
        while (left<right){
            mid = left + (right-left)/2;
            if(arr[mid] <= x){
                left = mid+1;
            }else{
                right=mid;
            }
        }
        if(left<=n){
            if(left -1 >=0 && arr[left-1] == x)
                second =left-1;
        }

        result.add(first);
        result.add(second);

       return result;
    }
}
