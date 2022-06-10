/*
 * Author : Manjosh Ramesh
 */

package simpleRecursion;

public class Palindrome {
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String input){
        if(input.isEmpty() || input.length() ==1)
            return true;
        if(input.charAt(0) == input.charAt(input.length() -1))
            return isPalindrome(input.substring(1,input.length()-1));
        return false;
    }
}
