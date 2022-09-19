/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] arr = {"geeksforgeeks", "geeks", "geek",
                "geezer"};
        System.out.println(longestCommonPrefix(arr,arr.length));
        int mod = (int) (1e9+7);
        int sum =10;
        int result = (int) (sum%mod);
        System.out.println(result);
    }

    static String longestCommonPrefix(String[] arr, int n){
        // code here
        StringBuilder longestCommonPrefix = new StringBuilder();
        if(arr == null || arr.length ==0) return "-1";

        int ind =0;
        for(char c: arr[0].toCharArray()){
            for(int i =1;i<n;i++){
                if(ind>=arr[i].length() || c!=arr[i].charAt(ind)){
                    return longestCommonPrefix.toString().isEmpty()?"-1":longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(c);
            ind++;
        }

        return longestCommonPrefix.toString();
    }
}
