/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package divideAndConquer;

public class FibonacciUnOptamised {
    public static void main(String[] args) {
        System.out.println(fiboNacci(6));
    }
    public static int fiboNacci(int num){
        if(num ==0 || num ==1)
            return num;
        else
            return fiboNacci(num -1) + fiboNacci(num -2);
    }
}

