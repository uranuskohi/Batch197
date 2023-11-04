package practice_dt.practice03;

import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {

        int y = 0;
        for (int i = 1; i < 4; i++) {
            y = y + i;
        }
        System.out.println(y);


        ////////////////////////////////////////////////////////////
        int a = 80;
        int b = 20;
        while (a >= b) {
            a -= 10;
            b += 10;
            System.out.println(a + "," + b);
        }


        //////////////////////////////////////////////////////////////////
        Scanner scan = new Scanner(System.in);
        String s = "";
        do {
            System.out.println("Enter your password");
            s = scan.nextLine();
            if (s.length() > 6 && s.charAt(0) == 'A') {
                System.out.println("it is okay");
            } else {
                System.out.println("make the length longer than 6");
            }
        } while (!(s.length() > 6));
        scan.close();


        ////////////////////////////////////////////////////////////////////////
        int i = 1;
        do {
            if (i != 3) {
                System.out.print(i + " ");
            } else {
                continue;
            }
            i++;
        } while (i < 5);


        //////////////////////////////////////////////////////////////
        int m = 1;
        do {
            if (m == 3) {
                continue;
            } else if (m == 5) {
                System.out.println(m + " ");
                break;
            } else{
                System.out.println(m + " ");
            }
            m++;
        }while (true);









    }
}
