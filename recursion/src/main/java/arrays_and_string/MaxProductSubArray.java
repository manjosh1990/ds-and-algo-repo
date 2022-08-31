/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class MaxProductSubArray {
    public static void main(String[] args) {
        //int[] Arr = {2, 3, 4, 5, -1, 0};
        //int[] Arr = {8,-2,-2,0,8,0,-6,-8,-6,-1};
        int[] Arr = {-8,5,3,1,6};
        int n = Arr.length;
        System.out.println(maxProduct(Arr, n));
    }

    static long maxProduct(int[] arr, int n) {
        // code here
      //  if (n < 1) return 0;
        long maxProduct = Integer.MIN_VALUE;
        long product = 1;
        for (int i = 0; i < n; i++) {
            product = product * arr[i];
            maxProduct = Math.max(maxProduct, product);
            if(product ==0) product =1;
        }
        product = 1;
        for (int i = n-1; i >= 0; i--) {
            product = product * arr[i];
            maxProduct = Math.max(maxProduct, product);
            if(product ==0) product =1;
        }

        return maxProduct;
    }
}
