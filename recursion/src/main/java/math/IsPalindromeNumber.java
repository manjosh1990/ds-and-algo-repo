/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package math;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(111));
    }
    static boolean isPalindromeNumber(int num){
        int rev =0;
        int n = num;
        while (n>0){
            int dig = n%10;
            rev = rev*10+dig;
            n = n/10;
        }

        return num==rev;
    }
}
