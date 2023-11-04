package day03_concatenation_scanner_class;

public class C01Concatenation {
    public static void main(String[] args) {

        // Concatenation: It is process of adding Strings or String with other data types
        //                To do concatenation it has a symbol of "+"

        String name = "Tom";
        String lastName = "Hanks";
        String fullName = name+" "+lastName;
        System.out.println(fullName);

        System.out.println("Tom " + "Hanks");
        System.out.println("Tom" + " Hanks");
        System.out.println("Tom" +" "+ "Hanks");

        System.out.println("Tom" + 4 +9);
        System.out.println("Tom" + (4 +9));
        System.out.println("Tom"+ 3*5);
        System.out.println("Tom" + 8+3*5+9);
        System.out.println(5+9 + "Tom");

        System.out.println(3+5*2+ "Tom" +4+2);
    }
}
