/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
      int[] Arr = {12, 5, 787, 1, 23};
      int k=2;
        System.out.println(Arrays.toString(kLargest(Arr, Arr.length, k)));
    }
    static int[] kLargest(int[] arr, int n, int k) {
        // code here
        int[] result = new int[k];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            queue.add(i);
        }

        for(int i =0;i<k;i++){
            result[i]= queue.remove();
        }

        return result;
    }
}
