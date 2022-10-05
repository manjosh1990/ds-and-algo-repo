/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {
    public static void main(String[] args) {
        int m =100;
        int n =100;
        System.out.println(numberOfPaths(m,n));
    }

    static long numberOfPaths(int m, int n)
    {
        // code here
        Map<String,Long> map = new HashMap<>();
        return gridTraveller(m,n,map);
    }

    static long gridTraveller(int m, int n, Map<String,Long> map){
        String key =m+"-"+n;
        long mod =1000000007L;
        if(map.containsKey(key)) return map.get(key);
        if(m==1 && n==1) return 1L;
        if(m==0 || n==0) return 0;
        long result = (gridTraveller(m-1,n,map) + gridTraveller(m,n-1,map))%mod;

        map.put(key,result);
        return result;
    }
}
