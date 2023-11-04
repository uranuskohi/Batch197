package day23_exception;

public class C03Exception03 {
    public static void main(String[] args) {

        String [] str = {"Uranus" , "Hulya", "Cagatay" , "Selim"};
        printArrayElement(str, 1);
        printArrayElement(str, 2);
        printArrayElement(str, 4);
        System.out.println((convertStringToInteger("125") + 1));
        System.out.println((convertStringToInteger("0") + 1));
        System.out.println((convertStringToInteger("-5") + 1));
        System.out.println((convertStringToInteger("12shdfosh") + 1)); // NumberFormatException: Java throws NumberFormatException
                                                                       // When non_numeric chars are used for converting to Integer

    }

    // Create a method that prints an Array element in a given index on the console

    public static void printArrayElement(String [] s, int idx){
        try {
            System.out.println(s[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no element in a given index");
            System.out.println(e.getMessage());
        }
    }

    // Create a method to convert given String to Integer
    public static Integer convertStringToInteger(String str){
        int result = 0;
        try {
           result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}
