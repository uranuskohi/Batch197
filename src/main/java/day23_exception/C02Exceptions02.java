package day23_exception;

public class C02Exceptions02 {
    /*

         Exceptions are strict rules in java. They help developers not to do critical mistake.
         For example, you want to do division operation. You are not so good at math.
         You think you can divide any two numbers. Indeed, a number can not be divided by zero.
         In this case, Java will "throw exception".
                      1: Explain the rule
                      2: Stop execution
         When exception occur in the codes the following codes will not be executed
         When exception occur in try block following codes will not be executed java  will jump to catch block

     */
    public static void main(String[] args) {

        System.out.println(divide(12,4)); // 3
        System.out.println(divide(2,4)); // 0
        System.out.println(divide(0, 8)); // 8

        System.out.println(numberOfCharsInString("Java")); //
        System.out.println(numberOfCharsInString("")); //
        System.out.println(numberOfCharsInString(null)); // NullPointerException: Java throws NullPointerException
                                                         // When using null value for some methods
        System.out.println(numberOfChars(null));

    }

    // First Way to handle exception:
    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
            return a/b;
    }

    // Second Way: "try_catch" block
    public static int divideNumber(int a, int b) {
      int result = 0;
      try {
          result = a/b;
      } catch (ArithmeticException e){
          System.out.println("You can not divide by zero....");
      }
      return result;
    }




    // Create a method that will get the number of characters in a given String
    // First Way:
    public static int numberOfCharsInString(String str) {
        if (str == null){
            return 0;
        }
        return  str.length();
    }
    // Second Way:
    public static int numberOfChars(String str) {
        int result = 0;
        try {
            result = str.length();
        }catch (NullPointerException e) {
            result = 0;
            System.out.println("Hi");
        }
        return result;
    }



}