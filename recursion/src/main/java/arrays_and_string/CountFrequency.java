/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class CountFrequency {

    public static void main(String[] args) {
        //int [] arr = {10,10,10,10,10};
        int[] arr = {85, 62, 2, 88, 16, 31, 36, 12, 10, 7, 79, 4, 37, 27, 63, 1, 4, 87};
        System.out.println(arr.length);
        frequencyCount(arr, arr.length, arr[arr.length - 1]);
        System.out.println(Arrays.toString(arr));
    }

    public static void frequencyCount(int[] arr, int N, int P) {
        // code here
        int i = 0;
        while (i < N) {
            int val = arr[i];
            if (val > N) {
                arr[i] = 0;
                i++;
                continue;
            }
            if (i == val - 1) {
                arr[i] = -1;
                i++;
            } else if (val <= 0) {
                i++;
            } else {
                int temp = arr[val - 1];
                if (temp < 0) {
                    arr[val - 1] = arr[val - 1] + -1;
                    arr[i] = 0;
                } else {
                    arr[val - 1] = -1;
                    if (temp > N)
                        arr[i] = 0;
                    else
                        arr[i] = temp;
                }
            }
        }
        for (int j = 0; j < N; j++) {
            arr[j] = arr[j] * -1;
        }
    }
}
