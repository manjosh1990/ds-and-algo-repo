/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        //String s = "3[b2[ca]]";
        // String s = "1[b]";
        String s ="11[geeks]";
        System.out.println(decodedString(s));
    }

    static String decodedString(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        Stack<Integer> nums = new Stack<>();
        Stack<String> letters = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int n = 0;
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    n = n * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                nums.push(n);
            } else {
                if (s.charAt(i) == ']') {
                    int times = nums.pop();
                    StringBuilder inner = new StringBuilder();
                    while (!letters.peek().equals("[")) {
                        inner.append(letters.pop());
                    }
                    letters.pop();
                    StringBuilder newStr = new StringBuilder();
                    for (int j = 0; j < times; j++) {
                        newStr.append(inner);
                    }
                    letters.push(newStr.toString());
                } else {
                    letters.push("" + s.charAt(i));
                }
            }
        }
        while (!letters.isEmpty()){
            ans.append(letters.pop());
        }
        return ans.reverse().toString();
    }
}
