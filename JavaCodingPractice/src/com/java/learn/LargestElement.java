package com.java.learn;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargestElement {

    public static void largestElement(int[] input){

        //int input[] = {1,2,4,6,3,};

        int largest = Integer.MIN_VALUE;

        for(int i =0; i< input.length;i++){

            if(input[i]>largest){
                largest = input[i];
            }
        }
        System.out.println("LArgest Element from Array: "+ largest);

    }

    public static void main(String[] args) {

        /*int[] input = {1,2,13,5,3};
        LargestElement.largestElement(input);

       int maxEle =  Arrays.stream(input).max().getAsInt();
       System.out.println("Max Element:"+ maxEle);*/

        List<Integer> numList = Arrays.asList(1,3,3,4,66,2,8);
      int maxElem = numList.stream().max(Integer::compareTo).get();


      System.out.println("Max Elemet"+maxElem);


    }
}
