/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class KadanesString {
    public static void main(String[] args) {
      String  W = "abcde";
        int N = 1;
        char [] X = { 'c' };
       int[] B = { -1000 };
        System.out.println(maxSum(W,X,B,N));
    }
    static String maxSum(String w, char[] x, int[] b, int n){
        //code here
        int max = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(x[i],b[i]);
        }
        StringBuilder ans= new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int curr =0;
        for(char c:w.toCharArray()){
            int val = map.containsKey(c)? map.get(c):c;curr=curr+val;
            temp.append(c);

            if(curr<0){
                curr = 0;
                temp = new StringBuilder();
            }
            if(curr>max){
                max = curr;
                ans=new StringBuilder(temp);
            }
        }
        return ans.toString();
    }
}
