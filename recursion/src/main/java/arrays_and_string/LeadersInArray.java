/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        int n = A.length;
        System.out.println(leaders(A, n));
    }

    static ArrayList<Integer> leaders(int[] arr, int n) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        if (n < 1) return result;
        int rightMax = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (rightMax <= arr[i]) {
                result.add(rightMax);
                rightMax = arr[i];
            }
        }
        result.add(rightMax);
        ArrayList<Integer> newResult = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            newResult.add(result.get(i));
        }
        return newResult;
    }
}
