package day09_loops;

import java.util.Scanner;

public class C08DoWhileLoop02 {
    public static void main(String[] args) {

        // type a code to find sum of the integer from 7 to 10
        int i = 7;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i < 11);
        System.out.println(sum);

        // Ask user to enter an integer.
        // If the integer is less than 100, tell user "Won!"
        // Otherwise, tell user "Lost!"

        int i2 = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter a number...");
            i2 = input.nextInt();
            if (i2 < 100) {
                System.out.println("You won");

            }
        } while (i2 < 100);
        System.out.println("You lost");






    }


}
