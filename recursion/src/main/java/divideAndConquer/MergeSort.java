/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 *//*


package divideAndConquer;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = new int[]{5, -1,100, 8, 2, 7, 4};
        System.out.println("before sorting");
        printArray(input );
        System.out.println("after sorting");
        mergeSort(input);
        printArray(input);
    }

    public static void mergeSort(int[] inputArr) {
        int inputLength = inputArr.length;
        if (inputLength < 2) return;

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        //fill up left half
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArr[i];
        }

        //fill right half
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //merge the left and right arrays
        merge(inputArr,leftHalf,rightHalf);
    }
    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0,j=0,k=0;
        while(i<leftSize && j<rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i <leftSize){
            inputArray[k] = leftHalf[i];
            k++;
            i++;
        }
        while (j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i <array.length -1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
*/
package divideAndConquer;
class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = new int[]{5, -8, 2, -12, 1, 0, 100};
        System.out.println("before processing");
        printArray(inputArray);
        System.out.println("after sorting");
        mergeSort(inputArray);
        printArray(inputArray);
    }

    public static void mergeSort(int[] inputArr) {
        int inputLength = inputArr.length;

        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;

        int[] letfArray = new int[midIndex];
        int[] rightArray = new int[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            letfArray[i] = inputArr[i];
        }
        for(int i = midIndex; i < inputLength; i++) {
            rightArray[i - midIndex] = inputArr[i];
        }
        mergeSort(letfArray);
        mergeSort(rightArray);

        merge(inputArr, letfArray, rightArray);
    }

    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int letfSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, j = 0, k = 0;
        while (i < letfSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k++] = leftArray[i++];
            } else {
                inputArray[k++] = rightArray[j++];
            }
        }
        while (i < letfSize) {
            inputArray[k++] = leftArray[i++];
        }
        while (j < rightSize) {
            inputArray[k++] = rightArray[j++];
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}