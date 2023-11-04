package practice_dt.practice04;

public class Q01_Varargs {
    public static void main(String[] args) {

        // Type a method that accepts a variable number of integers as arguments and sums them
        // acc mod static return type multiply(int a, int b){
        //   action part --> return a*b;
        //   }

        System.out.println(sum(5,65,25,44444,587,5587935));

    }

    public static int sum(int ... number) {
        int sum = 0;
        for (int w : number) {
            sum = sum + w;
        }
        return sum;
    }
}
