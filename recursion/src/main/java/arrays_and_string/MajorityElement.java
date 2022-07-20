/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

//Moore's majority vote  algorithm
public class MajorityElement {
    public static void main(String[] args) {
         //int N =13;
        //int[] A = {1};
         //int[] A = {1,2,3};
        //int[] A = {3, 1, 3, 3, 2};
         int[] A = {9 ,14 ,10 ,10 ,1 ,2 ,1 ,7 ,10 ,10 ,14 ,19 ,9};
        System.out.println(majorityElement(A, A.length));
    }

    static int majorityElement(int[] a, int size) {
        // your code here
        int len = size / 2;
        int ansIndex = 0;
        int count = 1;

        for (int i = 1; i < size; i++) {
            if (a[i] == a[ansIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ansIndex = i;
                count = 1;
            }
        }
        if(count >0){
            count =0;
            int val = a[ansIndex];
            for (int i=0;i<size;i++){
                if(a[i]==val)count++;
            }
            if(count>len) return val;
            else
               return  -1;
        }else return -1;
    }
}
