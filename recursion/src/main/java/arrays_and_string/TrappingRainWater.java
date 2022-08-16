/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        //int[] arr = {7, 4, 0, 9};
        int[] arr = {1, 1, 5, 2, 7, 6, 1, 4, 2, 3};
        // System.out.println(trappingWater(arr, arr.length));
        System.out.println(trappingWater(arr));
    }

    static long trappingWater(int[] arr, int n) {
        //Time = O(n)
        // Space = O(n)
        int trappedWater = 0;
        if (n < 3) return trappedWater;
        int[] leftMaxArr = findLeftMax(arr);
        System.out.println("LeftMaxArr : " + Arrays.toString(leftMaxArr));
        int[] rightMaxArr = findRightMax(arr);
        System.out.println("rightMaxArr : " + Arrays.toString(rightMaxArr));
        //finding trapped water
        for (int i = 1; i < n - 1; i++) {
            int waterLevel = Math.min(leftMaxArr[i], rightMaxArr[i]);
            if (arr[i] <= waterLevel) {
                trappedWater = trappedWater + waterLevel - arr[i];
            }
        }
        return trappedWater;
    }

    private static int[] findRightMax(int[] arr) {
        int[] rightMaxArr = new int[arr.length];
        int rightMax = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rightMaxArr[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }
        return rightMaxArr;
    }

    private static int[] findLeftMax(int[] arr) {
        int[] leftMaxArr = new int[arr.length];
        int leftMax = 0;
        for (int i = 0; i < arr.length; i++) {
            leftMaxArr[i] = leftMax;
            leftMax = Math.max(leftMax, arr[i]);
        }
        return leftMaxArr;
    }

    static long trappingWater(int[] arr) {
        //space O(1)
        int n = arr.length;
        long trappedWater = 0;
        if (n < 3) return trappedWater;

        int leftMax = arr[0];
        int rightMax = arr[n - 1];
        int left = 1;
        int right = n - 2;
        while (left <= right) {
            int waterLevel = 0;
            if (leftMax < rightMax) {
                waterLevel = leftMax;
                if (arr[left] <= waterLevel) {
                    trappedWater = trappedWater + waterLevel - arr[left];
                } else {
                    leftMax = arr[left];
                }
                left++;
            } else {
                waterLevel = rightMax;
                if (arr[right] <= waterLevel) {
                    trappedWater = trappedWater + waterLevel - arr[right];
                } else {
                    rightMax = arr[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
}
