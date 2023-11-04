package day09_loops;

public class C05WhileLoop02 {
    public static void main(String[] args) {

        // Type a code to print even numbers from 15 to 5


        int i = 15;
        while (i>4){
            if (i%2==0){
                System.out.println(i + " ");
            }
            i--;
        }

        // Example 2: type a code which will check if a given number is Palindrome or not
        //  12321 ---> palindrome  12312 ---> not palindrome

        int num = 12321;
        String numString = String.valueOf(num);
        String reversed = "";

        int k = numString.length()-1;
        while (k>=0){
           reversed = reversed + numString.charAt(k);
           k--;
        }
        if (numString.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Nor palindrome");
        }

    }
}
