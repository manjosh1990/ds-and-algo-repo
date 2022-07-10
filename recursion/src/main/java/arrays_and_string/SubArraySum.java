/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {
    public static void main(String[] args) {
        int[] A = {1,2,3,7,5};
        System.out.println(subArraySum(A,5,0));
    }
    public static List<Integer> subArraySum(int[] arr, int m, int s){
        List<Integer> result = new ArrayList<>();
        if(arr== null ||arr.length ==0 || s == 0){
            result.add(-1);
            return result;
        }
        int currSum =arr[0];
        int left = 0;
        int right = 0;
        while (true){
            if(currSum == s) break;
            if(right > m || left > m) break;
            if(currSum < s){
                right++;
                if(right < m)
                    currSum =currSum+arr[right];
            }else{
                if(left >=0)
                    currSum = currSum - arr[left];
                left++;
            }
        }
        if(currSum != s){
            result.add(-1);
            return result;
        }
        result.add(left);
        result.add(right);
        return result;
    }
}
