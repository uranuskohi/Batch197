package day07_string_manipulations;

public class C04StringManipulations05 {
    public static void main(String[] args) {

        //Example 5:  String shirtPrice = "$12.99";
        //            String bookPrice = "$35.99";
        //            Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        String sum = shirtPrice+bookPrice;
        System.out.println("sum = " + sum);

        // first step is to remove "$" in front
        shirtPrice = shirtPrice.replace("$","");
        System.out.println("shirtPrice = " + shirtPrice);
        bookPrice = bookPrice.replace("$","");
        System.out.println("bookPrice = " + bookPrice);

        // Second step: is to convert string to double by using wrapper class method.
        double doubleShirtPrice = Double.valueOf(shirtPrice);
        double doubleBookPrice = Double.valueOf(bookPrice);

        double sumPrices = doubleBookPrice+doubleShirtPrice;
        System.out.println("sumPrices = " + sumPrices);
    }
}
