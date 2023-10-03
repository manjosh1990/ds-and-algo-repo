/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package dynamic_programming;

public class FillingBucket {
    static int mod = 1000000007;
    public static void main(String[] args) {
        int N = 8223;
        System.out.println(fillingBucket2(N));
    }
    static int fillingBucket(int N) {
        // code here
        int[] dp = new int[N+1];
        return dfs(N,dp);
    }
    static int dfs(int N,int[] dp){
        if(N<0) return 0;
        if(N==0) return 1;
        if(dp[N] !=0) return dp[N];
        dp[N] = (dfs(N-1,dp) + dfs(N-2,dp))%mod;
        return dp[N];
    }

    static  int fillingBucket2(int N){
        //N = N-1 + N-2
        if(N==1) return 1;
        int mod = 100000000;
        int prev =2;
        int secPrev =1;
        for(int i =0; i<N-2;i++){
            int curr = (prev+secPrev)%mod;
            secPrev = prev;
            prev = curr;
        }
        return prev;
    }
}
