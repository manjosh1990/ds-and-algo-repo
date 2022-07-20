/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;
//corrrect output =
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] a = {13,9 ,2,5, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        System.out.println(duplicates(a,a.length));
    }
    public static ArrayList<Integer> duplicates(int[] arr, int length){
        ArrayList<Integer> result = new ArrayList<>();
        for(int n: arr){
            n = Math.abs(n);
            if(arr[n-1]>=0){
                arr[n-1] = arr[n-1]*-1;
            }else{
                result.add(n);
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}
