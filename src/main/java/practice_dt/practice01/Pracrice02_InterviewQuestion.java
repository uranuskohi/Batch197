package practice_dt.practice01;

public class Pracrice02_InterviewQuestion {
    public static void main(String[] args) {

        //Example1: Type code to swap two integers
        //          a= 12 and b=5  ==> a=5 and b= 12

        int a=12;
        int b=5;
        System.out.println(a + b);
        System.out.println("Before swapping: " + a + " " + b);

        int temp = 0;
        temp =a;
        a=b;

        b= temp;
        System.out.println("After swapping: " + a + " " + b);

        // 2.Way: do not create a third container

        int x = 12;
        int y = 5;
        System.out.println("Before swapping: " + x + " " + y);
        x= x+y;

        y= x-y;
        x= x-y;
        System.out.println("after swapping: " + x+ " " + y);




















    }
}
