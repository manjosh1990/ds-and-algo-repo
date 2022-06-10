/*
 * Author : Manjosh Ramesh
 * this program searches for the input number and returns its index from the array provided the array is sorted.
 */

package divideAndConquer;

public class BinarySearch {
    public static void main(String[] args) {
        int [] input = {-2,-1,0,1,2,3,4,9,10,20};
        System.out.println(binarySearch(input,0,input.length-1,10));
    }

    public static int binarySearch(int []A, int leftIndex,int rightIndex, int valueToSearch){
        if(leftIndex > rightIndex){
            return -1;
        }
        int midIndex = (leftIndex + rightIndex)/2;
        if(A[midIndex] == valueToSearch){
            return midIndex;
        }
        if(valueToSearch > A[midIndex]){
            //discard left and process only the right of the array
            return binarySearch(A,midIndex +1,rightIndex,valueToSearch);
        }

        //discard the right of the array and process the left of the array.
        return binarySearch(A,leftIndex, midIndex-1,valueToSearch);
    }
}
