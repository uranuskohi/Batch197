package day13_arraylist_methodcreation;

public class C03Method_Creation {
    public static void main(String[] args) {
        // Method Call:
        int r1 = add(3,7); // non-static method
        System.out.println(r1);

        double r2 = multiplyThreeNumbers(2.1,5.5,4.5);
        System.out.println(r2);

        String r3 = addStrings("ja" , "va");
        System.out.println(r3);

    }

    // type a method to add numbers
    public static int add(int a , int b) {
        int sum = a + b;
        return sum;
    }
        // type a method to multiply three numbers:
    public static double multiplyThreeNumbers(double a, double b, double c){
        return a*b*c;
    }

    // type a method that joins two strings:
    // Type a method that joins two Strings:
    public static String addStrings(String a, String b ) {
        return a.concat(b);
    }
}
