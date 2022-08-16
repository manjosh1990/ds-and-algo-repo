/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;

public class CountInversions {
    public static void main(String[] args) {
      //  int[] inputArr = {2, 3, 4, 5, 6};
        int[] inputArr = {468,335,1,170,225,479,359,463,465,206,146,282,328,462,492,496,443,328,437,392,105,403,154,293,383,422,217,219,396,448,227,272,39,370,413,168,300,36,395,204,312,323};
        System.out.println(mergeSort(inputArr));
        System.out.println(Arrays.toString(inputArr));
    }
   static int mergeSort(int[] inputArr){
        int invCount =0;
        int length = inputArr.length;
        if(length<2) return invCount;
        int mid = length/2;
        int[] leftArr = new int[mid];
        for(int i =0 ; i< mid ;i++){
            leftArr[i] = inputArr[i];
        }
        int[] rightArr = new int[length-mid];
        for(int i =mid; i < length ;i++){
            rightArr[i-mid] = inputArr[i];
        }
       invCount+= mergeSort(leftArr);
       invCount+= mergeSort(rightArr);

        invCount+= merge(leftArr,rightArr,inputArr);
        return invCount;
    }
    static int merge(int[] leftArr, int[] rightArr, int[] arr) {
        int invCount=0;
        int i=0,j=0,k=0;
        int mid = leftArr.length;
        int rightLen = rightArr.length;
        while (i<mid && j<rightLen){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }else{
                invCount += mid -i;
                arr[k++] = rightArr[j++];
            }
        }
        while (i<mid){
            arr[k++] = leftArr[i++];
        }
        while (j<rightLen){
            arr[k++] = rightArr[j++];
        }
        return invCount;
    }
}


