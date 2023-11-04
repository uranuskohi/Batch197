package day06_switch_ternary_stringmanipulations;

public class C04TernaryOperator02 {
    public static void main(String[] args) {

        //Example 5: Type code to check if an integer is odd and if it is even it should be divisible 3.
        //           7 ==> Odd    12 ==> Even ==> divisible by 3    14 ==> Even ==> Not divisible by 3

        int num = 18;
        String result = (num%2==0)? (num%3==0) ? "Even and Divisible by three":"Even but not divisible by three": "Odd";
        System.out.println(result);


        //Example 6: (Interview Question)
        //Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400. (2000+, 1800-)
        //If a year is not divisible by 100 then it must be divisible by 4. (1996+, 2001-)

        int year = 2000;
        String result2 = (year%100==0) ? (year % 400==0 ? "Leap year" : "Not leap year") :
                (year %4==0 ? "Leap year" : "Not leap year" );
        System.out.println(result2);


    }
}
