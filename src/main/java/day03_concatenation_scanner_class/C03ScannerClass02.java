package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C03ScannerClass02 {
    public static void main(String[] args) {

        // Ask full name of the user and print on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fullName :...");
        String fullName = input.nextLine();
        System.out.println("Full Name is = " + fullName);

        System.out.println("Please enter only first name of your parent:...");
        String firstName = input.next();
        System.out.println("firstName is = " + firstName);


    }
}
