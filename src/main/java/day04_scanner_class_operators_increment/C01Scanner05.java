package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C01Scanner05 {

    public static void main(String[] args) {

        //Example 3: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
        //           Then print them on the console in different lines with a label
        // First: Create Scanner class

        Scanner input = new Scanner(System.in);

        // Second: Give message to the user:
        System.out.println("Please enter your full name:...");
        String fullName = input.nextLine();
        System.out.println("Please enter your age:...");
        byte age = input.nextByte();
        System.out.println("Please enter your Height:...");
        int height = input.nextInt();
        System.out.println("Please enter your Marital Status:...");
        String status = input.next();

        System.out.println("Full Name is = " + fullName);
        System.out.println("Your age is = " + age);
        System.out.println("Your height is = " + height);
        System.out.println("Your Marital status is = " + status);


    }

}
