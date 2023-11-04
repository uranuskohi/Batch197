package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C06IfStatement04 {
    public static void main(String[] args) {

        //Example 5: Type java code by using if-else if() statement.
        //A school has rules for grading system:
        //1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
        //Ask user to enter marks and print the corresponding grade.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mark...");
        byte mark = input.nextByte();

        if (mark<0){
            System.out.println("Mark of a student can not be less then zero");
        }else if (mark<50) {
            System.out.println("Your grade is : D");
        }else if (mark<60) {
        System.out.println("Your grade is : C");
    }else if (mark<80) {
        System.out.println("Your grade is : B");
    }else if (mark<101) {
        System.out.println("Your grade is : A");
    }else {
            System.out.println("Marks more then 100 are not allowed");
        }





    }
}
