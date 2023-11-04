package day07_string_manipulations;

public class C02StringManipulations03 {
    public static void main(String[] args) {

        ////Example 3: Type code to print just the unique characters in a String
        ////           "Hello" ==> Heo
        //Example 3: Type code to print just the unique characters in a String
        //           "Hello" ==> Heo

        String word = "Hello";
        String unique = "";

        int firstOccurOfH =word.indexOf("H");
        int lastOccurOfH =word.lastIndexOf("H");
        if(firstOccurOfH == lastOccurOfH){
            System.out.println("H");
            unique = unique+"H";
        }

        int firstOccurOfE =word.indexOf("e");
        int lastOccurOfE =word.lastIndexOf("e");
        if(firstOccurOfE == lastOccurOfE){
            System.out.println("e");
            unique = unique+"e";
        }

        int firstOccurOfL =word.indexOf("l");
        int lastOccurOfL =word.lastIndexOf("l");
        if(firstOccurOfL == lastOccurOfL){
            System.out.println("l");
            unique = unique+"l";
        }

        int firstOccurOfO =word.indexOf("o");
        int lastOccurOfO =word.lastIndexOf("o");
        if(firstOccurOfO == lastOccurOfO){
            System.out.println("o");
            unique = unique+"o";
        }

        if(firstOccurOfH == lastOccurOfH) {
            System.out.print("H");
        }
        if(firstOccurOfE == lastOccurOfE){
            System.out.print("e");
        }
        if(firstOccurOfL == lastOccurOfL){
            System.out.print("l");
        }
        if(firstOccurOfO == lastOccurOfO){
            System.out.println("o");
        }
        System.out.println(unique);
    }

}