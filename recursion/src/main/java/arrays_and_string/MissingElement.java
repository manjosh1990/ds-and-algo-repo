/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class MissingElement {
    public static void main(String[] args) {
        int[] A = {2,4,6,8,9,10,12};
        int[] B = {2,4,6,8,10,12};
        System.out.println(findExtra(A,B,A.length));
    }
    public static int findExtra(int[] a, int[] b, int n) {
        // add code here.
        for(int i =0; i<n;i++){
            int num = a[i];
            if(binarySearch(b,0,b.length-1,num)==-1){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int []A, int leftIndex,int rightIndex, int valueToSearch){
        if(leftIndex > rightIndex){
            return -1;
        }
        int midIndex = (leftIndex + rightIndex)/2;
        if(A[midIndex] == valueToSearch){
            return midIndex;
        }
        if(valueToSearch > A[midIndex]){
            //discard left and process only the right of the array
            return binarySearch(A,midIndex +1,rightIndex,valueToSearch);
        }

        //discard the right of the array and process the left of the array.
        return binarySearch(A,leftIndex, midIndex-1,valueToSearch);
    }
}
