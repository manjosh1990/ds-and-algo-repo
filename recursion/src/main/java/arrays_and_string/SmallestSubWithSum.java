/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class SmallestSubWithSum {
    public static void main(String[] args) {
       int[] A = {1, 4, 45, 6, 0, 19};
        int x  =  51;
        System.out.println(smallestSubWithSum(A,A.length,x));
    }
    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here
        int i =0;
        int j =0;
        int min = Integer.MAX_VALUE;
        int sum =0;
        while (i<=j && j<n){
            while (sum<=x && j<n){
                sum+=a[j++];
            }
            while (sum>x && i<j){
                min = Math.min(min,j-i);
                sum-=a[i];
                i++;
            }
        }
        return min;
    }
}
