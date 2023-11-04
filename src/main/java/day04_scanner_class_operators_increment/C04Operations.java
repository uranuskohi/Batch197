package day04_scanner_class_operators_increment;

public class C04Operations {
    public static void main(String[] args) {

        // "=" Assignment operator: assigns value from left and gives it to the right
        // "==" Equality operator:  compares right hand side with left hand side
        //  3+5 == 8 ===>  true    3+2 == 2  false
        //  'A' == 65 ===> true

        // If we use chars together with math operator java uses their ascii value
        System.out.println('A'==65);
        System.out.println("A" + "a");// Aa
        System.out.println('A' + 'a');// 162
        System.out.println("A" + 'a');// A97


        // Example: find ascii value of '!' by typing code
        System.out.println('!' + 0); // 33
        System.out.println('!' * 1); // 33
        // '!' Not operator: !true = false   !false = true   !!ture = true


        /*
            '==' with Strings
            for every string data there are two main parts;  1: Value  2: Address
            When we compare string values do not prefer to use '==' operator.
            To compare two strings use string methods. (equal()).

         */

        String s1 = "Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String("Tom");

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        System.out.println(s1==s4);//false
        System.out.println(s1.equals(s4));//ture


    }
}
