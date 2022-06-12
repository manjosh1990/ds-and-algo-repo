/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package divideAndConquer;

import java.util.HashMap;
import java.util.Map;

public class FibonacciOptimized {
    static Map<Integer,Long> cache = new HashMap<>();
    static {
        cache.put(0,1l);
        cache.put(1,1l);
    }
    public static void main(String[] args) {
        System.out.println(fib(100));
    }

    public static Long fib(Integer n){
        if(cache.containsKey(n)) return cache.get(n);

        long result = fib(n-1) + fib(n-2);
        cache.put(n,result);
        return result;
    }
}
