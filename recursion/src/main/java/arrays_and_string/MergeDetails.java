/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string;

import java.util.*;

public class MergeDetails {
    public static void main(String[] args) {
        List<List<String>> input = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        l1.add("John");
        l1.add("johnsmith@mail.com");
        l1.add("john_newyork@mail.com");
        input.add(l1);
        l1 = new ArrayList<>();
        l1.add("John");
        l1.add("johnsmith@mail.com");
        l1.add("john00@mail.com");
        input.add(l1);
        l1 = new ArrayList<>();
        l1.add("Mary");
        l1.add("mary@mail.com");
        input.add(l1);
        l1 = new ArrayList<>();
        l1.add("John");
        l1.add("johnnybravo@mail.com");
        input.add(l1);
        System.out.println(mergeDetails(input));
    }

    public static List<List<String>> mergeDetails(List<List<String>> details) {
        // Your code here
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < details.size(); i++) {
            List<String> currList = details.get(i);
            if (currList.isEmpty()) continue;
            String name = currList.get(0);
            Set<String> emails = new TreeSet<>();
            for (int j =1;j<currList.size();j++){
                emails.add(currList.get(j));
            }
            //check if other lists have same email
            for(int j =i+1;j<details.size();j++){
                merge(details.get(j),emails);
            }
            //merge name and the emails set;
            List<String> mergedList = new ArrayList<>();
            mergedList.add(name);
            mergedList.addAll(emails);
            result.add(mergedList);
            currList.clear();
        }
        return result;
    }
    static void merge(List<String> otherList, Set<String> emails){
        if(otherList.isEmpty()) return;
        for(int i =1;i<otherList.size();i++){
            String newEmail = otherList.get(i);
            if(emails.contains(newEmail)){
                for (int j =1;j<otherList.size();j++){
                    emails.add(otherList.get(j));
                }
                otherList.clear();
                break;
            }
        }
    }
}
