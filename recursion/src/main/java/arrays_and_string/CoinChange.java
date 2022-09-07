/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {
    public static void main(String[] args) {
        //int[] coins = {1, 2, 3};
        int[] coins = {2,5,3,6};
        int sum = 10;
        System.out.println(count(coins, coins.length, sum));
    }

    public static long count(int[] coins, int N, int sum) {
        // code here.
        Map<String,Long> map = new HashMap<>();
        return solve(coins, N - 1, sum,map);
    }

    static long solve(int[] coins, int M, int sum, Map<String,Long> map) {
        if (M < 0) return 0;
        if (sum < 0) return 0;
        if (sum == 0) return 1;
        String key = M +"-"+sum;
        long ans =0;
        if(map.containsKey(key)){
            return map.get(key);
        }else {
                int newSum = sum-coins[M];
                int newElm = M-1;
            ans = solve(coins, M, newSum, map) + solve(coins, newElm, sum, map);
            map.put(key,ans);
            return ans;
        }
    }
}
