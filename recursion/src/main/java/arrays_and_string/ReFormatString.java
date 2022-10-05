/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

public class ReFormatString {
    public static void main(String[] args) {
        String S = "-yD-tuI-wm-9sCUp5";
        int K =13;//4
        System.out.println(reFormatString(S,K));
    }
    static String reFormatString(String S, int K){
        // code here
        StringBuilder result = new StringBuilder();
        int cnt =0;
        for(int i =S.length()-1;i>=0;i--){
            char c = S.charAt(i);
            if(c=='-') continue;
            if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else {
                result.append(c);
            }
            cnt++;
            if(cnt==K){
                result.append("-");
                cnt=0;
            }
        }
       if(result.length() >0 && result.charAt(result.length()-1)=='-') result.deleteCharAt(result.length()-1);

       return result.reverse().toString();
    }
}
