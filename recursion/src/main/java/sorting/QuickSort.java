/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        Random random = new Random();
        for(int i =0;i<nums.length;i++){
            nums[i] = random.nextInt(100);
        }
        System.out.println("before sorting ");
        System.out.println(Arrays.toString(nums));

        quickSort(nums);
        System.out.println("after sorting ");
        System.out.println(Arrays.toString(nums));
    }
    private static void quickSort(int[] arr){
        quickSort(arr,0,arr.length -1);
    }
    private static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;
        //1. chose pivot
        int pivotIndex = new Random().nextInt(high-low)+low;
        int pivot = arr[pivotIndex];
        swap(arr,pivotIndex,high);

        //2. partition the array
        int leftPointer = partition(arr, low, high, pivot);
        quickSort(arr,low,leftPointer-1);
        quickSort(arr,leftPointer+1,high);
    }

    private static int partition(int[] arr, int low, int high, int pivot) {
        int leftPointer = low;
        int righPointer = high;

        while (leftPointer<righPointer){
            while (arr[leftPointer] <= pivot && leftPointer < righPointer){
                leftPointer++;
            }
            while (arr[righPointer] >= pivot && leftPointer < righPointer){
                righPointer--;
            }
            //3. swap number
            swap(arr,leftPointer,righPointer);
        }
        //4.swap pivot with left pointer;
        swap(arr,leftPointer, high);
        return leftPointer;
    }

    private static void swap(int[] arr, int leftPointer, int righPointer) {
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[righPointer];
        arr[righPointer] = temp;
    }
}
