package day07_string_manipulations;

public class C05StringManipulations06 {
    public static void main(String[] args) {

        //Example 6: Type a code to find the number of punctuation marks used in a String.
        //           "Wooow!... Toms is 13, and he is in university...????"

        String s1 =  "Wooow!... Toms is 13, and he is in university...????";
        int numOfPunc = s1.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(numOfPunc);

        //Example 7: Type a code to find the number of words used in a String
        //           "Learn Java, earn huge amount of money." ==> 7

        String s2 = "Learn Java, earn huge amount of money.";
        int numOfSpaces = s2.trim().replaceAll("[^ ]", "").length();
        int numOfWords = numOfSpaces+1;
        System.out.println("numOfWords = " + numOfWords);


        // second method:
        int numOfWords2 = s2.trim().split(" ").length;
        System.out.println("numOfWords2 = " + numOfWords2);

        //Example 8: Type a code to find the number of letters used in a String
        //           "Learn Java, earn huge amount of money." ==> 30

        int numOfLetters = s2.replaceAll("[^A-Za-z]", "").length();
        System.out.println("numOfLetters = " + numOfLetters);

        int numOfLetters2 = s2.replaceAll("[^A-Za-z]","").length();
        System.out.println("s2 = " + s2);

    }
}
