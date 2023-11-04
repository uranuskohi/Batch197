package day09_loops;

public class C04WhileLoop01 {
    public static void main(String[] args) {

        /*

               for( initial index  ; condition ;   inc/dec){
                  code to be executed
               }

               While loop:

               initial index;

               While( condition ){

               code to be executed

               inc/dec;

               }

         */

        // Type numbers from 4 to 14 on console
        for (int i = 4; i<15; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        int k =4;
        while (k<15){
            System.out.print(k + " ");
            k++;
        }

    }
}
