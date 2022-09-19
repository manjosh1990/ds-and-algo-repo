/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 6, 7, 7, 15, 21, 30, 39, 41, 41, 43, 43, 44, 47, 49};

        int[] arr2 = {5, 7, 9, 17, 24, 27, 30, 32, 35, 41, 49};
        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        // add your code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int elm = -1;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (arr1[i] != elm)
                    result.add(arr1[i]);
                elm = arr1[i];
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (arr2[j] != elm)
                    result.add(arr2[j]);
                elm = arr2[j];
                j++;
            } else {
                if (arr1[i] != elm)
                    result.add(arr1[i]);
                elm = arr1[i];
                i++;
                j++;
            }
        }
        if (i < n) {
            elm = result.get(result.size() - 1);
            while (i < n) {
                if (elm != arr1[i]) {
                    result.add(arr1[i]);
                    elm = arr1[i];
                }
                i++;
            }
        }

        if (j < m) {
            elm = result.get(result.size() - 1);
            while (j < m) {
                if (elm != arr2[j]) {
                    result.add(arr2[j]);
                    elm = arr2[j];
                }
                j++;
            }
        }
        return result;
    }
}
