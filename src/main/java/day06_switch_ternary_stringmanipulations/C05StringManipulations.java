package day06_switch_ternary_stringmanipulations;

public class C05StringManipulations {
    public static void main(String[] args) {


        /*
        --------------- Regular Expressions -----------------
        i) If we handle group of data we use regular expression
        - All Uppercase letters: [A-Z]
        - All Lowercase letters: [a-z]
        - All letters          : [A-Za-z]
        - All digits           : [0-9]
        - letters from b to m  : [b-m]
        - group of letters akmre : [akmer]

        - All chars different from Uppercase letters : [^A-Z]
        - All chars different from Lowercase letters : [^a-z]
        - All chars different from  letters : [^A-Za-z]
        - All chars different from  digits : [^0-9]
        - All chars different from  letters and digits : [^A-Za-z0-9]

        - All punctuation marks : \\p{Punct}
         */


        // Example 1: Count the alphabetical chars in a given string
        // "Tom12 Hanks!..." -----> 8

        String name = "Tom12 Hanks!...";
        System.out.println(name.replaceAll("[^A-Za-z]", "")
                .length());
        // replaceAll() --->  is used to replace group of data from string with something else
        // length()    ----> counts the number of chars in a string

        // Example: 2 Write a code to change all numbers by * in a given password
        String password = "a126Rd?q5";
        String hiddenPass = password.replaceAll("[0-9]","*");
        System.out.println(hiddenPass);

        // Example:3 Get initials from full name: (Middle names are exculeded)
        // "Tom Hanks" ---->TH    "  toM Hanks  " --->TH    " tOm hAnKs " ----> TH
        String name2 = "tOm hAnKs";
        // How to get first initial
        String firstInitial = name2.trim().substring(0,1).toUpperCase();

        // How to get Second initial
        String secondInitial = name2.trim().split(" ")[1].
                substring(0,1).
                toUpperCase();

        System.out.println(firstInitial+secondInitial);

        //trim(): Removes spaces from the beginning and from the end
        //substring(s, e): It gets a part of the String.
        //                 "s" stands for starting index which is inclusive
        //                 "e" stands for ending index which is exclusive
        //toUpperCase(): Changes all alphabetical characters to upper cases in a String
        //split(): Splits a String from given character and indexes every part





    }
}
