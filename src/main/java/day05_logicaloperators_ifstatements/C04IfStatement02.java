package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C04IfStatement02 {
    public static void main(String[] args) {

        // Example 3: Ask user to enter initial of letter of a day, then print
        //            all possible days starting with that initial

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter initial letter of a day...");
        char initial = input.next().charAt(0);
        if (initial=='M' || initial == 'm'){
            System.out.println("Monday");
        }else if (initial=='T'|| initial == 't'){
            System.out.println("Tuesday and Thursday");
        }else if (initial=='W'|| initial == 'w'){
            System.out.println("Wednesday");
        }else if (initial=='F'|| initial == 'f'){
            System.out.println("Friday");
        }else if (initial=='S'|| initial == 's'){
            System.out.println("Saturday and Sunday");
        }else {
            System.out.println("Please enter a valid initial...");
        }


        // initial Character.toLowerCase(initial)





    }
}
