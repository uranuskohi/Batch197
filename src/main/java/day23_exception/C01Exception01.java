package day23_exception;

import java.util.Scanner;

public class C01Exception01 {
    public static void main(String[] args) {

        int totalPrice = 1200;
        System.out.println(installmentPayment(totalPrice));
        System.out.println("Do you want to continue");




    }
    public static int installmentPayment(int price){
        int numOfInstallments;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the installment amount");
        numOfInstallments = input.nextInt();
        if (numOfInstallments == 0) {
            return price;
        }
        return price/numOfInstallments;
    }
}
