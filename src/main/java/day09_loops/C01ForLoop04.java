package day09_loops;

public class C01ForLoop04 {
    public static void main(String[] args) {

        /*
        Example 7: Type code to print the following image on the console (Nested For Loop)

            X X X X
            X X X X
            X X X X

         */

        int row = 4;
        int column = 4;
        for (int i =0; i<row; i++){
            System.out.println("X X X X ");
            String pattern = "";
            for (int k =0 ; k<column; k++){
                pattern = pattern+ "X ";
            }
            System.out.println(pattern);
        }


    }
}
