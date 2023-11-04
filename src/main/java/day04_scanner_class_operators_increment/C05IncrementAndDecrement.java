package day04_scanner_class_operators_increment;

public class C05IncrementAndDecrement {
    public static void main(String[] args) {

        // Increment means to increase the value of a variable

        int age = 15;
        System.out.println(age + 1);
        System.out.println(age);
        // First way of increment
        age = age +1;
        System.out.println(age);

        // Second way of increment
        age += 5;
        System.out.println(age);

        // We can do increment by multiplication as well
        age = age*2;
        System.out.println(age);

        age *= 2;
        System.out.println(age);

        // Decrement is to decrease the value of variable
        age = age - 3;
        System.out.println(age);

        age -= 1;
        System.out.println(age);

        age = age/4;
        System.out.println(age);

        age /=5;
        System.out.println(age);


        // Special format for increment by 1 and decrement by 1
        age++;
        System.out.println(age);

        age--;
        System.out.println(age);
    }
}
