/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package arrays_and_string.puzzles;

import java.util.Arrays;
import java.util.Objects;

public class Smurfs {
    public static void main(String[] args) {
        String[] inp = {"R", "G", "B", "R", "B"};
        System.out.println(minFind(inp.length,inp));
    }
    static int minFind(int n, String[] arr){
        // code here
        for(int i =1;i<n;i++){
            if(Objects.equals(arr[i - 1], "R") && Objects.equals(arr[i], "G")){
                arr[i] ="B";
                arr[i-1]="B";
                  i--;
            }else if(Objects.equals(arr[i - 1], "G") && Objects.equals(arr[i], "B")){
                arr[i] ="R";
                arr[i-1]="R";
                 i--;
            }else if(Objects.equals(arr[i - 1], "B") && Objects.equals(arr[i], "R")){
                arr[i] ="G";
                arr[i-1]="G";
                  i--;
            }
        }
        int a = 0;
        int b =0;
        int c =0;
        System.out.println(Arrays.toString(arr));
        for(int i =0; i<n;i++){
            if(Objects.equals(arr[i], "R")){
                a=1;
            }else if(Objects.equals(arr[i], "G")){
                b=1;
            }else if(Objects.equals(arr[i], "B")){
                c=1;
            }
        }

        return a+b+c;
    }
}
