/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;

public class StockBuyAndSell {
    public static void main(String[] args) {
        //int[] A = {100, 180, 260, 310, 40, 535, 695};
        int[] A ={4,3,2,1};
                //assert stockBuySell(A, A.length) != null;
        stockBuySell(A, A.length).forEach(System.out::println);
    }

    static ArrayList<ArrayList<Integer>> stockBuySell(int[] A, int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i = 0;
        ArrayList<Integer> list = null;
        while (i < n) {
            while(i+1 < n && A[i]>A[i+1]){
                i++;
            }
            if(result.isEmpty() && i==n-1){
                break;
            }
            list = new ArrayList<>();
            list.add(i);
            while (i+1<n && A[i]<A[i+1]){
                i++;
            }
            list.add(i);
            result.add(list);
            i++;
        }
        return result;
    }
}
