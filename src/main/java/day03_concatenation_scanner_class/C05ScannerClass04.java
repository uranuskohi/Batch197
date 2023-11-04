package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C05ScannerClass04 {
    public static void main(String[] args) {

        //  Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:...");
        double width = input.nextDouble();
        System.out.println("Enter the length of the rectangle...");
        double length = input.nextDouble();
        double area = width*length;
        double perimeter = 2*(length+width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
