/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class NumberOfOccurances {
    public static void main(String[] args) {
     //int [] arr= { 1,1,2, 2, 2, 2, 3};
       //  int [] arr= { 2,2,2, 2, 2, 2};
        int [] arr ={1,3,4};
     int X =3;
        System.out.println(count(arr,arr.length,X ));
    }
    static int count(int[] arr, int n, int x) {
        // code here
        int low =0;
        int high = n;
        int start =-1;
       while (low<high){
           int mid = (low+high)/2;
           if(arr[mid]<x){
               low = mid+1;
           }else{
               high = mid-1;
           }
       }
       if(arr[low] != x) return 0;
       start = low;

       low =0;
       high =n-1;
       while (low<high){
           int mid = (high+low)/2;
           if(arr[mid]>=x){
               low=mid+1;
           }else {
               high = mid;
           }
       }
        System.out.println("end :"+low);
       return low;
    }
}
