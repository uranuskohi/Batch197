package ssg_switchcase;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        /*

        Type java code by using ternary.
        Write a program to print absolute value of an integer entered by user.

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate its absolute value");
        int num = input.nextInt();

        int absValue = num<0 ? num*-1 : num;
        System.out.println("absValue is = " + absValue);


    }
}
