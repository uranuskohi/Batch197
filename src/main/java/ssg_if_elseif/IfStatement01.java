package ssg_if_elseif;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //conditional statements can be typed by using if statements
        //Ask user to enter his/her gender and age and return for "male" return boy/man (age is less than 13 you should give boy)
        // for "female" girl/woman as an output on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = input.next().toLowerCase();
        System.out.println("Enter your age");
        byte age = input.nextByte();

        if (gender.equals("male")){
            if (age<13){
                System.out.println("You are a boy");
            }else {
                System.out.println("Men");
            }
        }else if (gender.equals("female")){
            if (age<13){
                System.out.println("You are a girl");
            }else {
                System.out.println("You are a women");
            }

        }else {
            System.out.println("Enter male or female not other characters");
        }

    }
}
