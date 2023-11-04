package ssg_if_elseif;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {


        //Ask user to give the quantity of the products he buys and calculate the discount regarding the total
        // amount of unit Price bought during shopping. If user gives amount of products as over 1000
        // and every unit price he buys is over 30$ 10% discount should be applied and if every unit number is less than 30$
        // than 5% discount should be applied. If user gives amount of products less than 1000
        // and unit price over 100$ than discount will be applied as 4% if the bought product amount is less than 100
        // than there is no discount message should be given to the user.

        Scanner input = new Scanner(System.in);
        System.out.println("Give me the quantity of the product");
        int quantity = input.nextInt();
        System.out.println("Enter the unit price for the product");
        double unitPrice = input.nextDouble();
        if (quantity > 1000) {
            if (unitPrice > 30) {
                System.out.println("You win 10% discount");
            } else {
                System.out.println("You win 5% discount");
            }
        } else if (quantity < 1000) {
            if (unitPrice > 100) {
                System.out.println("You win 4% discount");
            } else {
                System.out.println("No discount");
            }
        } else {
            System.out.println("Please just enter numbers not the other characters");
        }


        Scanner input1 = new Scanner(System.in);


        System.out.println("enter quantity of products");
        int qty = input.nextInt();

        System.out.println("enter price");
        double price = input.nextDouble();


        if (qty > 1000 && price > 30) {

            double money10 = qty * price * 0.9;
            System.out.println(money10);

        } else if (qty > 1000 && price < 30) {
            double money5 = qty * price * 0.95;
            System.out.println(money5);

        } else if (qty < 1000 && price > 100) {

            double money4 = qty * price * 0.96;
            System.out.println(money4);

        } else {
            System.out.println("no discount");
        }


    }
}
