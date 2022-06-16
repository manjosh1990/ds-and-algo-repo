/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *Given a string 's'. The task is to find the smallest window length that contains all the characters of the given string at least one time.
For eg. A = aabcbcdbca, then the result would be 4 as of the smallest window will be dbca.



Example 1:

Input : "AABBBCBBAC"
Output : 3
Explanation : Sub-string -> "BAC"
Example 2:
Input : "aaab"
Output : 2
Explanation : Sub-string -> "ab"
 */

package arrays_and_string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestDistinctWindow {
    public static void main(String[] args) {
        String input = "AABBBCBBAC";
        int result = findSubString(input);
        System.out.println(result);
    }

    private static int findSubString(String str) {
        int ans = str.length();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        int i = 0;
        int j = 0;
        int n = uniqueChars.size();
        Map<Character,Integer> charFrequencyMap = new HashMap<>();
        while (i < str.length()){
            char currentChar = str.charAt(i);
            charFrequencyMap.put(currentChar, charFrequencyMap.getOrDefault(currentChar,0) +1);

            if(charFrequencyMap.size() == n){
                while (charFrequencyMap.get(str.charAt(j)) >1){
                        charFrequencyMap.put(str.charAt(j),charFrequencyMap.get(str.charAt(j))-1);
                        j++;
                }
                ans = Math.min(ans, i-j +1);
            }
            i++;
        }
        return ans;
    }
}
