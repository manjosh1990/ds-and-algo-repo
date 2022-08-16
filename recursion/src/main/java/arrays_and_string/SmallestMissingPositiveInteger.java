/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class SmallestMissingPositiveInteger {

    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,-20};
        System.out.println(missingNumber(arr,arr.length));
    }

    static int missingNumber(int[] arr, int size) {
        // Your code here
        for(int i =0; i<size;i++){
            int element = arr[i];
            int pos = element-1;
            if(pos < size && element >0 && arr[pos] != element){
                swap(arr,pos,i);
                i--;
            }
        }
        for (int i=0 ;i<size ;i++){
            if(i+1 != arr[i]) return i+1;
        }

        return size+1;
    }

    private static void swap(int[] arr, int pos, int i) {
        int element = arr[i];
        arr[i] = arr[pos];
        arr[pos] = element;
    }
}
