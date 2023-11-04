package day13_arraylist_methodcreation;

public class C04MethodOverLoading {
    public static void main(String[] args) {

        add(3,8);

    }

    // Create a method to add two integers
    public static int add(int a, int b){
        return a +b;
    }
    // Create a method to add three integers
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    // Create a method to add one integer and one double
    public static double add(int a, double b){
        return a+b;
    }
    // Create a method to add one double and one integer
    public static double add(double a, int b){
        return a+b;
    }

    // method overloading: using same method name with different parameters in a class
    // parameters can be made different by three ways:
    //  i) different number of parameters
    //  ii) different data types
    //  iii) order of parameters if they have different data type

    // Method signature: Method name + parameters
    // static and non-static methods can be overloaded
    // Access modifiers, static keyword and return types can not make methods different and can be used in method overloading
    // Java is OOP language. It has four principles: 1) Inheritance  2) Polymorphism = method overloading + method overwriting
    //                                               3) Encapsulation  4) Abstraction




}
