package ssg_switchcase;

import java.util.Scanner;

public class SwitchCase02 {
    public static void main(String[] args) {

        //  Ask user ta enter one of the 'U', 'S', and 'A'.
        //            Then type a program by using "switch statement" to print "United" for 'U'
        //            "States" for 'S', and "America" for 'A

        Scanner input = new Scanner(System.in);
        System.out.println("Enter U or S or A as a character to see the output");
        char letter = input.next().charAt(0);
        switch (letter){
            case 'U':
                System.out.println("United");
                break;
            case 'S':
                System.out.println("States");
                break;
            case 'A':
                System.out.println("America");
                break;
            default:
                System.out.println("Enter A or U or S not the other characters");
        }

    }
}
