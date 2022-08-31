/*
,* Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package math;import java.util.ArrayList;
import java.util.List;

public class ArithMetics {
    public List<Integer> getPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors.add(i);
        }
        return factors;
    }

    public boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i=2; i<= num/2 ;i++){
            if(num % i ==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArithMetics mt = new ArithMetics();
        System.out.println(mt.getPrimeFactors(81));
        System.out.println(mt.isPrime(6));
    }
}
