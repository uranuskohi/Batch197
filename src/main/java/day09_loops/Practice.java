package day09_loops;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


       /*
        Scanner input = new Scanner(System.in);
         System.out.println("Whats Your Name? ");
        String name = input.nextLine();
        String firstName = input.next();
        System.out.println("Your full name is: " + name);
        System.out.println("Your first name is: " + firstName);
        */


        //    Nested for loop

        int row = 4;
        int column = 12;
        for (int i = 0; i<row; i++){
            String pattern= "";
            for (int k =0 ; k<column; k++){
                pattern = pattern+ "X ";
            }
            System.out.println(pattern);
        }

        //  Days of the week and the weeks
        int week = 4;
        int days = 7;
        for (int i= 1; i<=week; i++) {
            System.out.println("week: " + i);
            for (int k = 1; k <= days; k++) {
                System.out.println("   days: " + k);
            }
        }

        System.out.println();
        //    Months of the year
        int year = 2;
        int month = 12;

        for (int i = 1; i<=year; i++){
            System.out.println("year: " + i);
            for (int k = 1; k<=month; k++){
                System.out.println("  Month: " + k);
            }
        }

        //   sum of digit numbers
        double num = 28.587;
        String numStr = String.valueOf(num);
        String decimalString = numStr.split("[.]")[1];
        System.out.println(decimalString);
        int decimal = Integer.valueOf(decimalString);
        int sum= 0;
        for (int i = 587; i>0; i/=10){
            sum = sum + i%10;
        }
        System.out.println(sum);



        //    type code from 4 to 10
        for (int i = 4; i<11; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 4;
        while (i<11){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();



        //     print even numbers from 15 to 5
        int u= 15;
        while (u>4){
            if (u%2==0){
                System.out.print(u + " ");
            }
            u--;
        }
        System.out.println();



        //    palindrome 12321
        int num1 = 12321;
        String numStr1 = String.valueOf(num1);
        String reversed = "";
        int k = numStr1.length()-1;
        while (k>=0){
            reversed = reversed + numStr1.charAt(k);
            k--;
        }
        if (numStr1.equals(reversed)){
            System.out.println(" Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
        System.out.println();



        //  palindrome 7896987
        int number = 7896987;
        String number1 = String.valueOf(number);
        String reversed1 = "";

        int y = number1.length()-1;
        while (y>=0){
            reversed1 = reversed1 + number1.charAt(y);
            y--;
        }
        if (number1.equals(reversed1)){
            System.out.println("Palindrome");
        } else {
            System.out.println(" Nor palindrome");
        }
        System.out.println();



        //    sum of digits with while loop
        int d = 587;
        int sumOfD = 0;
        while (d>0){
            sumOfD = sumOfD+d%10;
            d/=10;
        }
        System.out.println(sumOfD);


        // multiplication table for 3
        int sumt =3;
        int t = 1;
        while (t<11){
            System.out.println(t + "*" + sumt + "=" + t*sumt);
            t++;
        }


























    }
}
