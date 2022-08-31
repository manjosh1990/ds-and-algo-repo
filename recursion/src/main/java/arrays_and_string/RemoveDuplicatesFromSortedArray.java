/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        //int [] arr = {1,3,4,5,6,12,13,17,19,22,23,25,27,28,28,35,36,37,39,43,46,48,54,59,62,63,65,68,68,70,70,72,79,82,83,92,92,93,95,96,96,100};

        System.out.println(remove_duplicate(arr,arr.length));
        System.out.println(Arrays.toString(arr));
    }
    static  int remove_duplicate(int[] A,int N){
        System.out.println("old length ="+N);
        int l = 1;
        for(int i =1;i<N;i++){
            if(A[i-1] != A[i]){
                A[l++] = A[i];
            }
        }
        for(int i = l; i<N;i++){
            A[i] =0;
        }
        return l;
    }
}
