/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

Example 1:

Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output:
3 3 4 5 5 5 6
Explanation:
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6
 */

package arrays_and_string;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaxOfAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        List<Integer> list = max_of_subarrays(arr,arr.length,3);
        System.out.println(list);
    }

    static ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k)
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        //process first K elements

        int i =0;
        for(;i<k;i++){
            //for every element, previous smaller elements are useless, so remove them from the Dequeue
            while (!q.isEmpty() && arr[i] >= arr[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        //process rest of the elements from arr[k] to arr[n-1]
        for(;i<n;i++){
            //the element at the front of the queue is the largest element of the previous window, so print it
//            System.out.print(arr[q.peek()]+" ");
            result.add(arr[q.peek()]);
            //remove the elements which are out of this window
            while(!q.isEmpty() && q.peek() <= i-k){
                q.removeFirst();
            }
            //remove all elements smaller than the currently being added element(remove useless elements)
            while (!q.isEmpty() && arr[i] >= arr[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        //System.out.print(arr[q.peek()]);
        result.add(arr[q.peek()]);
        return result;
    }
}
