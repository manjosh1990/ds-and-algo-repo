/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = "ab";
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String str){
        int len = str.length();
        int j = len -1;
        int i = 0;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
