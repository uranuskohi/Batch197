package day10_loops_arrays;

import java.util.Scanner;

public class C02DoWhileLoop02 {
    public static void main(String[] args) {

        /*

              Username is "admin", Password is "p12"
              Ask user to enter username and password
              User should see "Enter your username and password" message
              If user enters correct credentials, he should get "You are in your account!" message
              Otherwise, he should see "Enter your username and password" message 3 times
              After 3 times he should get "Your account is blocked" message
         */

        String userName = "admin";
        String passWord = "p12";
        int counter = 0;

        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your User name...");
            String usrName = input.next();
            System.out.println("Enter your password...");
            String pass = input.next();

            if (usrName.equals(userName) && pass.equals(passWord)){
                System.out.println("You are in your account!");
                break;
            }
            counter++;
            if (counter==3){
                System.out.println("Your account has been blocked!");
                break;
            }
        } while (true);















    }
}
