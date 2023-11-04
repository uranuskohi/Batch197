package day10_loops_arrays;

import java.util.Scanner;

public class C01DoWhileLoop01 {
    public static void main(String[] args) {

        /*  Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"
       */
        int num =0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a Number...");
            num = input.nextInt();
            if (num<100){
                System.out.println("You Won!");
            }
        } while (num<100);
        System.out.println("You Lost!");
        // Second Way:
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a Number...");
            num = input.nextInt();
            if (num>=100){
                System.out.println("You Lost!");
                break;
            }
            System.out.println("You Won!");
        } while (true);
    }
}
