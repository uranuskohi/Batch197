package  day23_exception;

public class C04Exceptions04 {
    /*
       1) In Java , "Exception" and "Error" can be thrown
       2)  What is the difference between "Exception" and " Error" ?
            "Exception" can be handled but "Error" can not be handled
            Examples of Errors:     StackOverFlowError : Stack memory is full.
                                    OutOfMemoryError : Heap memory is full
                                    VirtualMachineError :

            Examples of Exceptions:     i) Runtime Exceptions
                                           ArithmeticException
                                           NullPointerException
                                           NumberFormatException
                                           ArrayIndexOutOfBoundsException
                                           StringIndexOutOfBoundsException
                                           ...
                                        ii) CompileTime Exceptions
                                            FileNotFoundException
                                            IOException
         3) When we use multiple catch blocks, if there is parent child relation
            between Exceptions we must put child catch block first.
     */
    public static void main(String[] args) {
        System.out.println(convertCharToIntFromString("12345", 2));
        System.out.println(convertCharToIntFromString("12345", 5)); // StringIndexOutOfBoundsException Java throws StringIndexOutOfBoundsException
        // When we try to get char at out of bond
        System.out.println(convertCharToIntFromString("12a45", 2)); // NumberFormatException

        System.out.println(convertCharacterToIntFromString("12345", 5));
        System.out.println(convertCharacterToIntFromString("12a45", 2));
    }

    // Create a method gets a character from a String and converts it to int
    // First Way: We may prefer to handle multiple exceptions separately.
    public static int convertCharToIntFromString(String str , int idx){
        int result = 0;
        try {
            String ch = str.substring(idx, idx + 1);

            result= Integer.parseInt(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index cannot be longer than length of the String....");

        }catch (NumberFormatException e){
            System.out.println("String Should not contain non-digit characters...");
        }
        return result;
    }

    // Second Way:
    public static int convertCharacterToIntFromString(String str , int idx){
        int result = 0;
        try {
            String ch = str.substring(idx, idx + 1);

            result= Integer.parseInt(ch);

        }catch (Exception e){
            System.out.println(e.getMessage());


        }
        return result;
    }

    // Third Way:
    public static int convertCharacterToIntFromStr(String str , int idx){
        int result = 0;
        try {
            String ch = str.substring(idx, idx + 1);

            result= Integer.parseInt(ch);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index cannot be longer than length of the String....");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


}









