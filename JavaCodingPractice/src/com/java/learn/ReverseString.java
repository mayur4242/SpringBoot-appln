package com.java.learn;

public class ReverseString {

    public static  void reverString (String input){
        //String input ="Programming";
        int left =0;
        int right = input.length()-1;
        char[] toChar = input.toCharArray();

        while(left < right){

            char temp = toChar[left];
            toChar[left] = toChar[right];
            toChar[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reverse String :"+ new String(toChar));
    }

    public static void main(String[] args) {

        String input = "Programming";
        ReverseString.reverString(input);


    }
}