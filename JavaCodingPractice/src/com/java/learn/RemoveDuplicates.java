package com.java.learn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    //int arr[] = {2,3,4,6,2,3,4};

    public static int removeDuplicates(int[] input) {

        int i = 0;
        for (int j = 1; j < input.length-1; j++) {
            if (input[i] != input[j]) {
                i++;
                input[i] = input[j];
            }
        }
        return  i+1;

    }

    public static void main(String[] args) {

        int[] input =  {2,3,4,6,2,3,4};

       int [] removeDuplicates1 = Arrays.stream(input).distinct().toArray();
       System.out.println("Remove Duplicates:::"+ Arrays.toString(removeDuplicates1));
/*
        System.out.println("RemoveDuplicates:"+RemoveDuplicates.removeDuplicates(input));
*/

        Set<Integer> removeDuplicates = new HashSet<>();

        for(int n: input){
            removeDuplicates.add(n);
        }

        System.out.println(removeDuplicates);

    }
}
