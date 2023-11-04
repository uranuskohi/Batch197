package ssg_switchcase;

import java.util.Scanner;

public class SwitchCase01 {
    public static void main(String[] args) {

       //

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer please...");
        char answer = input.next().toUpperCase().charAt(0);
        switch (answer){
            case 'A':
            case 'B':
            case 'D':
                System.out.println("False");
                break;
            case 'C':
                System.out.println("True");
            default:
                System.out.println("Enter a letter not the other characters");
        }

    }
}
