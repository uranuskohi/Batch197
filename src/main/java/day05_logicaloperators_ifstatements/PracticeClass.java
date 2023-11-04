package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class PracticeClass {
    public static void main(String[] args) {

        int age = 19;
        age = age + 1;
        System.out.println(age);// 20

        age+= 1;
        System.out.println(age);// 21

        age = age - 1;
        System.out.println(age);// 20
        age++;
        System.out.println(age);// 21
        age--;
        System.out.println(age);// 20


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a initial name of the day...");
        char initial = input.next().charAt(0);
        if (initial=='M' || initial=='m'){
            System.out.println("Monday");
        } else if (initial=='T' || initial=='t'){
            System.out.println("Tuesday and Thursday");
        } else if (initial=='W' || initial=='w'){
            System.out.println("Wednesday");

        }


    }
}
