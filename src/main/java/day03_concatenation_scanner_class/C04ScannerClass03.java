package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C04ScannerClass03 {
    public static void main(String[] args) {

        // Example 1: Ask user to enter 2 numbers, then print the sum and the multiplication of the numbers on the console
        // First step: Create Scanner class

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter First number:...");
        double num = input.nextDouble();
        System.out.println("Enter second number:...");
        double num1 = input.nextDouble();

        double sum = num+num1;
        double multiply = num*num1;
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Multiply of the numbers is: " + multiply);


    }
}
