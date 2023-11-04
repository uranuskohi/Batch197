package day08_for_loop;

public class C02ForLoop01 {
    public static void main(String[] args) {

        // Type "Hi" 5 times

        // Typing like below id difficult to type, to update, to fix bugs in it.
        // It has many repettintions
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // Java created loop to make repeating actions easy.
        // There are 4 types of loop: 1: For Loop  2: while loop 3: do while loop 4: for each loop
        System.out.println("Before loop.......");
        // For loop: -----> takes three parameters


        //     starting point       conditions           increment/decrement
        for ( int i = 1;               i<6;                  i++               ){
            System.out.println("Hi");
        }

        // Example 2: Type code to print numbers from 15 to 4 on the console
        for ( int i=15; i>3;   i--){
            System.out.print(i + " ");
        }


    }
}
