package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C03ScannerClass07 {
    public static void main(String[] args) {

        //Example 5: Type code gets mile from user then converts it to kilometers
        //           1 mile is 1.6 km

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the mile:...");
        double mile = input.nextDouble();
        double kilometers = mile * 1.6;
        System.out.println(mile + "Mile is equal to " + kilometers + "kilometers");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter distance in miles to be converted to km :...");
        double distance = input.nextDouble();
        double distanceInkm= 1.6*distance;
        System.out.println("The distance is: "+ distanceInkm + "km");









    }
}
