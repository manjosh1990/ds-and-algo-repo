/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(price, price.length);
        System.out.println(Arrays.toString(span));
    }

    public static int[] calculateSpan(int[] price, int n)
    {
        // Your code here
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);

        for(int i =0; i<n;i++){
            while(!s.isEmpty() && price[s.peek()] <= price[i]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i-s.peek();
            }
            s.push(i);
        }
        return span;
    }
}
