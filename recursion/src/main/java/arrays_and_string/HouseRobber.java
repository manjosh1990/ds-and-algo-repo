/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
    public static void main(String[] args) {
        int [] a = {5,5,10,100,10,5};
        System.out.println(FindMaxSum(a,a.length));
    }
    public static int FindMaxSum(int[] arr, int n)
    {
        Map<Integer,Integer> map = new HashMap<>();

        return solve(arr,n-1,map);
    }
    static int solve(int[] a,int n,Map<Integer,Integer> map){
        if(n <=-1) return 0;
        if(map.containsKey(n)) return map.get(n);
        int op1 = a[n] +solve(a,n-2,map);
        int op2 = solve(a,n-1,map);
        map.put(n, Math.max(op1,op2));
        return map.get(n);
    }
}
