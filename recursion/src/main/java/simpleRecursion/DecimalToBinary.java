/*
 * Author : Manjosh Ramesh
 */

package simpleRecursion;

/*
 * For calculating the binary value of a decimal, divide the number by 2
 * prepend the result(remainder (number %2)) with the number/2
 * base case: if number == 0 return result;
 */

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(findBinary(253,""));
    }
    public static String findBinary(int decimalValue, String result){
        if(decimalValue == 0)
            return result;

        result = decimalValue %2 +result;
        return findBinary(decimalValue/2,result);
    }
}
