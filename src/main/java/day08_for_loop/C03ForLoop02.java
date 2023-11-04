package day08_for_loop;

public class C03ForLoop02 {
    public static void main(String[] args) {

        // Example 3: type code that print even numbers between 6 and 17

        for ( int i= 6;  i<18; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        // Example 4: Type a code that prints all numbers between 6 and 17 but not 13
        // first way
        for ( int i= 6;  i<18; i++) {
            if (i!=13) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // second way
        for ( int i= 6;  i<18; i++) {
            if (i==13) {
                continue;// "continue" keyword takes you directly to the increment part of the loop
                         // it is used to skip some value
            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();


        // Example 5: Type code to print all characters in a string one by one. If you see "x" you should stop printing on the console
        //            "I like extra effort"
        String s1 =  "I like extra effort";

        for (int i = 0;  i<s1.length(); i++ ){
            char ch = s1.charAt(i);
            if (ch=='x'){
                break;
            }
            System.out.print(ch);


        }















    }
}
