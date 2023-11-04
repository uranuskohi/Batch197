package day06_switch_ternary_stringmanipulations;

import java.util.Scanner;

public class C01SwitchStatement01 {
    public static void main(String[] args) {

        // Example 1: type cods that gives you name of the day after you give number of the day
        // 2 ----->  "Monday"    1 ----> "Sunday"
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the day...");
        byte numOfDay = input.nextByte();

        if (numOfDay==1){
            System.out.println("Monday");
        } else if (numOfDay==2){
            System.out.println("Tuesday");
        } else if (numOfDay==3){
            System.out.println("Wednesday");
        } else if (numOfDay==4){
            System.out.println("Thursday");
        } else if (numOfDay==5){
            System.out.println("Friday");
        } else if (numOfDay==6){
            System.out.println("Saturday");
        } else if (numOfDay==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Not a day number");
        }

        // Second way: Switch statement
        switch (numOfDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // default acts like else in if statement
                System.out.println("Please enter valid day number!...");
                break;//// last break in switch statement is optional

            // Switch statement can take byte (Byte), short (Short), int (Int), char (Char) and String data types as input
            // Switch statement doesn't accept long, double, float and boolean data types
        }

    }
}
