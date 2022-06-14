/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *Given a number n. The task is to find the smallest number whose factorial contains at least n trailing zeroes.

Example 1:

Input:
n = 1
Output: 5
Explanation : 5! = 120 which has at
least 1 trailing 0.
Example 2:

Input:
n = 6
Output: 25
Explanation : 25! has at least
6 trailing 0.
 */

package divideAndConquer;

public class TrailingZeros {
    public static void main(String[] args) {
        int n = 6;
        int fact = getFactorialFromZeros(n);
        System.out.println(fact);
    }

    private static int getFactorialFromZeros(int n) {
        if (n == 1) return 5;
        int low = 0;
        int high = n*5;
        int mid = low + (high-low)/2;
        while(low < high){
            int count = noOfZerosInFactorial(mid);
            if(count < n){
                low = mid+1;
            }else{
                high = mid;
            }
            mid = low+(high-low)/2;
        }
        return low;
    }

    private static int noOfZerosInFactorial(int n) {
        int res =0;
        int power = 5;
        while (power <= n){
            res += n/power;
            power = power *5;
        }
        return res;
    }
}
