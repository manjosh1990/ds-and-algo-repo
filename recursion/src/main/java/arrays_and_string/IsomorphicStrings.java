/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s= "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() !=t.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        for(int i =0 ; i< s.length() ;i++){
            if(!map.containsKey(t.charAt(i)))
                map.put(t.charAt(i),s.charAt(i));
        }
        for(int i =0 ; i< t.length() ;i++){
            if(map.get(t.charAt(i)) != s.charAt(i)) return false;
        }
        return true;
    }
}
