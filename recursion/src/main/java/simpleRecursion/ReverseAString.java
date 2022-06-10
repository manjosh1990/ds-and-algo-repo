/*
 * Author : Manjosh Ramesh
 */

package simpleRecursion;

public class ReverseAString {
    public static void main(String[] args) {
        String helloWorld ="hello world";
        System.out.println(reverse(helloWorld));
    }
    public static String reverse(String input){
        if(input.isEmpty())
            return "";
        return reverse(input.substring(1)) + input.charAt(0);
    }
}
