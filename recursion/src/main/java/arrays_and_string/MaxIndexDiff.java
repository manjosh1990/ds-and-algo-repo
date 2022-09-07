/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class MaxIndexDiff {
    public static void main(String[] args) {
        int[] arr = {85, 62, 2, 88, 16, 31, 36, 12, 10, 7, 79, 4, 37, 27, 63, 1, 4, 87};
        System.out.println(maxIndexDiff(arr,arr.length));
    }
    static int maxIndexDiff(int[] A, int N) {

        // Your code here
        int[] lMin = new int[N];
        int[] rMax = new int[N];

        //fill leftMin
        lMin[0] = A[0];
        for(int i =1; i<N;i++){
            lMin[i] = Math.min(lMin[i-1],A[i]);
        }
        System.out.println(Arrays.toString(lMin));
        //fill rMax
        rMax[N-1] = A[N-1];
        for(int i=N-2;i>=0;i--){
            rMax[i]=Math.max(A[i],rMax[i+1]);
        }
        System.out.println(Arrays.toString(rMax));
        int i=0;
        int j =0;
        int max =-1;
        while(i<N && j<N){
            if(lMin[i] <= rMax[j]){
                max = Math.max(max,j-i);
                j++;
            }else{
                i++;
            }
        }

        return max;

    }
}
