package com.java.learn;

import java.util.Arrays;
import java.util.List;

public class SmallestElement {

    //int arr[]={4,5,7,3,8,};

    public static void smallestElemet(int[] input){

        int smallEle = Integer.MAX_VALUE;

        for(int i=0; i<input.length;i++){
            if(input[i] < smallEle){
                smallEle = input[i];
            }
        }
        System.out.println(smallEle);

    }

    public static void main(String[] args) {

      /*  int[] input = {4,5,1,8,5,98};
        SmallestElement.smallestElemet(input);*/

        List<Integer> listNum = Arrays.asList(3,5,78,3,4,45,2,64,567);
      Integer smallEle =  listNum.stream().sorted((n1,n2)->n1.compareTo(n2)).findFirst().get();
      System.out.println(smallEle);

    }
}
