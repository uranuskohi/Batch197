package ssg_string_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        //trim() --> used for removing extra spaces from the beginning and from the end of  a String
        //indexOf() --> returns the index of the char in a given String if multiple same char exists then Java
        //returns the first occurrence of it
        //lastIndexOf() --> returns the last occurrence of a char in a given String
        //substring() --> this method works with 1 or 2 parameters and used for taking one part of a String value
        // if we give 1 parameter Java will return String value starting from the given upto the last index character.
        //if we give 2 parameters Java will return String value starting from the given index upto the second index that is
        // excluding the ending index

        String name= "Brad Pitt";

        System.out.println(name.substring(2,4));

        //Example : Count the number of words starts with "s" in the String

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str= input.nextLine();

        System.out.println("Enter the letter you want to search for");
        char letter= input.next().charAt(0);
        int counter=0;

        String[] splittedStr= str.toLowerCase().split(" ");
        System.out.println("splittedStr = " + Arrays.toString(splittedStr));
        //[Sam, is, learning, Java, and, he, says, he, will, earn, money]

        for (String w: splittedStr){
            if (w.startsWith(String.valueOf(letter))){
                counter++;
            }
        }
        System.out.println(counter + " words starts with " + letter+ " in the sentence");
        if (counter==0){
            System.out.println("There is no character starting with "+ letter+ " in the sentence");
        }



    }
}