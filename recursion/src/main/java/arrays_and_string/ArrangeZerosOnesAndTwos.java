/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class ArrangeZerosOnesAndTwos {
    public static void main(String[] args) {
        int[] A = {0,2,1,0,1};
        arrange(A,6);
        System.out.println(Arrays.toString(A));
    }

    private static void arrange(int[] A, int N) {
        int [] store = new int[3];
        for(int i =0 ; i< N ;i++){
            int index = A[i];
            store[index] = store[index]+1;
        }
        int i=0;
        for(int j = 0;j < store.length ;j++){
            while (store[j] >0){
                A[i] = j;
                store[j]--;
                i++;
            }
        }
        System.out.println(Arrays.toString(store));
    }
}
