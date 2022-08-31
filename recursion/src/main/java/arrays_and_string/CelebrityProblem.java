/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Note: Follow 0 based indexing.


Example 1:

Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0},
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity.

Example 2:

Input:
N = 2
M[][] = {{0 1},
         {1 0}}
Output: -1
Explanation: The two people at the party both
know each other. None of them is a celebrity.

Your Task:
You don't need to read input or print anything. Complete the function celebrity() which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 */

package arrays_and_string;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] M = {{0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}};
        System.out.println(celebrity(M,M.length));
    }

    static int celebrity(int[][] M, int n) {
        int potentialCandidate = -1;
        // code here

        //Add all elements to a stack

        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<M.length;i++){
            stack.push(i);
        }

        //compare two elements from stack until only 1 element is left
        while (stack.size() >1){
            int i = stack.pop();
            int j = stack.pop();

            if(M[i][j] == 1){
                // means i knows j hence i not a celebrity
                stack.push(j);
            }else{
                stack.push(i);
            }
        }
        System.out.println(stack.size());
        potentialCandidate = stack.pop();
        System.out.println("potential : " +potentialCandidate);
        //check if the candidate is correct
        for(int i=0;i<n;i++){
           if(i != potentialCandidate){
               if(M[potentialCandidate][i] == 1) return -1;
               else if(M[i][potentialCandidate] !=1) return -1;
           }
        }
        return potentialCandidate;
    }
}
