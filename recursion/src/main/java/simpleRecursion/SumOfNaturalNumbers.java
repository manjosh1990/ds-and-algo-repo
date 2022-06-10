/*
 * Author : Manjosh Ramesh
 */

package simpleRecursion;

/*
 * Author : Manjosh Ramesh
 * this code finds the sum of all natural numbers upto the input provided
 */

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers(10));
    }
    public static int sumNumbers(int number){
        if(number <=1) return number;

        return sumNumbers(number -1) + number;
    }
}
