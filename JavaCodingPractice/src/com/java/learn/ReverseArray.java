package com.java.learn;

import java.util.Arrays;

public class ReverseArray {

    public static void revArray(int[] input){

        int left = 0;
        int right = input.length-1;

        while (left<right){

            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args) {

        int[] input = {2,3,4,6,7};
        revArray(input);

    }
}
