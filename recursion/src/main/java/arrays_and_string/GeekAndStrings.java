/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeekAndStrings {
    public static void main(String[] args) {
       String[] li = {"abracadabra", "geeksforgeeks",
                "abracadabra", "geeks", "geeksthrill"};
        String[] query= {"abr", "geeks", "geeksforgeeks","ge", "gar"};
        System.out.println(prefixCount(li.length,query.length,li,query));
    } static List<Integer> prefixCount(int N, int Q, String[] li, String[] query)
    {
        // code here
        List<Integer> result = new ArrayList<>();

        Map<String,Integer> freq = new HashMap<>();
        for(String q: query){
            freq.put(q,0);
        }
        for(int i =0;i<N;i++){
            String str = li[i];
            for(int j =1;j<=str.length();j++){
                String subs =str.substring(0,j);
                if(freq.containsKey(subs)){
                  int count =  freq.get(subs);
                  freq.put(subs,count+1);
                }
            }
        }
        for(String qr:query){
            result.add(freq.get(qr));
        }
        return result;
    }

}
