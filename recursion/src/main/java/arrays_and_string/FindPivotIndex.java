/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums ={1,7,3,6,5,6};
        //1. find total sum
        int total = 0;
        for (int num: nums){
            total = total+num;
        }
        System.out.println(total);
        //2. have a pointed called left sum which holds the total sum to the left of the pivot index
        int leftSum = 0;

        //3. iterate the array and check if leftSum == totalSum -arr[i]-leftSum and return the index;
        //4. Else add the current nums value to leftSum and continue.
        int index =0;
        for (int i =0; i< nums.length ;i++){
            int rightSum = total - nums[i] - leftSum;
            if(leftSum == rightSum){
                index =i;
                break;
            }
            leftSum = leftSum+nums[i];
        }
        System.out.println(index);
    }
}
