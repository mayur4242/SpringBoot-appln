package com.java.learn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {

    //int input[] ={1,4,3,2};
    public static void secLargest(int[] input) {

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > largest) {
                secLargest = largest;
                largest = input[i];
            } else if (input[i] < largest && input[i] > secLargest) {

                secLargest = input[i];
            }
        }

        System.out.println("Second Largeest: " + secLargest);

    }


    public static void main(String[] args) {

/*        int[] input = {2,3,5,87,3,1,2,3,4};
        SecondLargestElement.secLargest(input);

        */

        List<Integer> listNum = Arrays.asList(2,3,4,6,3);

       int secLargest = listNum.stream().distinct().sorted().skip(1).findFirst().get();
       System.out.println("Second LargestEst: "+ secLargest);

    }
}
