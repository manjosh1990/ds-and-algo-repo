/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package math;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        //            1 2 3 4 5 6 7 8 9 10
        //boolean[]   t t t t t t t t t t
        int l = 1;
        int r = 2;
      //findPrimeFactors(num);
        System.out.println(getSumOfPrimeFactors(l,r));
    }

    private static boolean[] getPrimeNumbers(int num) {
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        //run loop till root n
        for (int i = 2; i * i <= num; i++) {
            for (int j = 2 * i; j <= num; j = j + i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    private static void findPrimeFactors(int num){
        boolean[] isPrime = getPrimeNumbers(num);
        for (int i =0;i<=num;i++){
            if(isPrime[i] && num % i==0){
                System.out.println(i);
            }
        }
    }
    private static int findSumOfPrimeFactors(int num,boolean[] isPrime){

        int count =0;
        for (int i =0;i<=num;i++){
            if(isPrime[i] && num % i==0){
                count+=i;
            }
        }
        return count;
    }
    static int getSumOfPrimeFactors(int l, int r){
        int ans =0;
        boolean[] primes = getPrimeNumbers(r);
        for(int i =l;i<=r;i++){
            if(i == 1){
                ans+=1;
                continue;
            }
            int currSum = findSumOfPrimeFactors(i,primes);
            ans+=currSum;
        }
        return ans;
    }
}
