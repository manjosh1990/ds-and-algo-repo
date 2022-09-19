/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package math;

import java.util.Arrays;

public class CountCompositeAndPrime {
    public static void main(String[] args) {
        System.out.println(Count(4, 6));
    }

    public static int Count(int L, int R) {
        // code here
        int primes = 0;
        int comp = 0;
        /*for (int i = L; i <= R; i++) {
            if(i==1) continue;
            if(isPrime(i)){
                prime++;
            }else{
                comp++;
            }
        }
        */

        // using sieve of eratosthenes
        boolean[] prime = new boolean[R+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=R;i++){
            if(prime[i]){
                for (int j =2*i;j<=R;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i =L;i<=R;i++){
            if(prime[i]){
                primes++;
            }else{
                comp++;
            }
        }
        if(L==1)comp--;
        return comp - primes;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
