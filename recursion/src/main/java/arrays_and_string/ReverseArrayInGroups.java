/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseArrayInGroups {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        int n = arrList.size();
        reverseInGroups(arrList, n, 3);
        System.out.println(arrList);
    }

    static void reverseInGroups(List<Integer> arr, int n, int k) {
        // code here
        for(int i =0; i< n;i+=k){
            int start = i;
            int end = Math.min(i+k-1,n-1);
            while (start<end){
                Collections.swap(arr,start,end);
                start+=1;
                end-=1;
            }
        }
    }
}
