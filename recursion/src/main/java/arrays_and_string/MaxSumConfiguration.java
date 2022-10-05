/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */
//Si+1 = Si +sum - n*arr[n-i-1];
package arrays_and_string;

public class MaxSumConfiguration {
    public static void main(String[] args) {
        int[] A = {8,3,1,2};
        System.out.println(max_sum(A,A.length));
    }

    static int max_sum(int[] A, int n)
    {
        // Your code here
        int sum =0;
        int S0 = 0;

        //loop array to find sum and S0;
        for(int i =0;i<n;i++){
            sum+=A[i];
            S0+=A[i]*i;
        }
        int max = S0;
        int Si = S0;
        for(int i =0;i<n-1;i++){
            int SiP1 = Si+sum -n*A[n-i-1];
            if(SiP1>max){
                max = SiP1;
            }
            Si =SiP1;
        }
        return max;
    }
}
