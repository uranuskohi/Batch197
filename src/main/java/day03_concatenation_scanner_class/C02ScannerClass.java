package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C02ScannerClass {
    public static void main(String[] args) {

        // Scanner Class: When we want to get input from user we use Scanner Class
        // To get data from user we need to follow these 3 steps:
        // 1. Create scanner class object
        Scanner input = new Scanner(System.in);

        //2. We need to write message to user
        System.out.println("Please enter your age:...");

        //3. Get data from user
         byte age = input.nextByte();
        System.out.println("Your age is :" + age);

    }
}
