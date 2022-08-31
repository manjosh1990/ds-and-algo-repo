/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class ConvertToWave {
    public static void main(String[] args) {
     int [] a= {1,2,3,4,5};
        convertToWave(a.length,a);
        System.out.println(Arrays.toString(a));
    }

    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i =0;i<n ;i+=2){
            if(i+1<n) {
                int x = a[i];
                a[i] = a[i+1];
                a[i+1] = x;
            }
        }
    }
}
