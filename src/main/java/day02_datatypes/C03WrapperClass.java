package day02_datatypes;

public class C03WrapperClass {
    public static <Char> void main(String[] args) {

        // Wrapper classes: java created a new data structure by adding some use full methods
        //                  this new structure is called as wrapper class
        //                  java created wrapper class for every primitive data

        /*

            Primitive                     Wrapper Class
            byte          -->              Byte
            short         -->              Short
            int           -->              Int
            long          -->              Long
            float         -->              Float
            double        -->              Double
            char          -->              Char
            boolean       -->              Boolean

         */

        // primitive data does not have methods
        int weight = 25;


        // Wrapper class has use full methods
        Integer height = 120;

        // We can find MAX or MIN value of int by using Wrapper class methods
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        // We can find MAX or MIN value of short data type by using Wrapper class methods
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        // Auto boxing: converting primitive data to wrapper class (Automatically).
        char chr = '?';
        Character chr2 = chr;

        // Unboxing: Converting wrapper class to primitive data (Automatically)
        Boolean b1 = true;
        boolean b2 = b1;

        //--------------- Examples ---------------

        Double num = 43.5; // change data type to short by wrapper class methods
        short fromDouble = num.shortValue();
        System.out.println("fromDouble = " + fromDouble);
        String strFromDouble = num.toString(); // "43.5"
        System.out.println("strFromDouble = " + strFromDouble);


        String str1 = "99.5";  // Convert it to double
        double fromString = Double.valueOf(str1);

        // Homework:
        String str2 = "99";
        int fromString2 = Integer.valueOf(str2);
        System.out.println(str2);
    }
}