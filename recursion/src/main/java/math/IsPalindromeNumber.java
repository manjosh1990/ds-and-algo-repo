/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package math;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(111));
        splitNumber(1004);
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
    static void splitNumber(int num){
        int n = num;
        int tens =1;
        int newNum =0;
        while (n>0){
            int dig = n%10;
            if(dig==0)dig=5;
            newNum = newNum+(dig*tens);
            tens*=10;
            n = n/10;
        }
        System.out.println(newNum);
    }
}
