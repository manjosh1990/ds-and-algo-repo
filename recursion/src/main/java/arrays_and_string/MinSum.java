/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class MinSum {
    public static void main(String[] args) {

        int[] Arr = {5, 3, 0, 7, 4};
        System.out.println(solve(Arr, Arr.length));
    }

    static String solve(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        long first =0L;
        long secnd =0L;
        for (int i = 0; i <n; i = i + 2) {
            int j = i +  1;
            //System.out.print(arr[i]);
           // System.out.print("  ");
            first = first*10+arr[i];
            if (j <n) {
               // System.out.print(arr[j]);
               // System.out.println();
                secnd = secnd*10+arr[j];
            }
        }
       // System.out.println(first);
       // System.out.println(secnd);

        return new String(String.valueOf(first + secnd));
    }

}
