/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class MinNumOfJumps {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(minJumps(arr,arr.length));
    }
    static int minJumps(int[] arr, int length){
        int jumps =1;
        int steps = arr[0];
        int maxReach = arr[0];
        if(length <=1) return 0;
        if(arr[0] == 0) return -1;
        for(int i =1; i<length;i++){
            if(i==length-1) return jumps;
            maxReach = Math.max(maxReach,i+arr[i]);
            steps--;
            if(steps ==0){
                jumps++;
                if(i>=maxReach) return -1;
                steps = maxReach -i;
            }
        }

        return -1;
    }
}
