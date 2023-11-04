package day09_loops;

public class C06WhileLoop03 {
    public static void main(String[] args) {

        // Example 10: Find the sum of the digits of an integer
        //             587 ==> 5+8+7=20

        int i = 587;
        int sum = 0;

        while (i>0){
            sum = sum+i%10;
            i/= 10;
        }
        System.out.println(sum);


        // Example : type a code to print table of multiplication for a given number
        //    3 ---> 3*1=3  3*2=6  3*3=9... 3*10=30

        int num = 3;
        int k = 1;
        while (k<11){
            System.out.println(num + "*" + k +"=" +num*k);
            k++;
        }



    }
}
