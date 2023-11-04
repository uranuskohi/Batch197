package ssg_forLoop;

public class Q01_ForLoop {
    public static void main(String[] args) {

        //Java created different loop structures to handle repeated work
        // There are 4 types of loops in Java
        // for loop --> you can tell Java either to start from the beginning index or the end index
        //for each/ enhanced loop
        // while loop
        // do while loop

        //Type code to print the integers divisible by 4 and by 6 from 13 to 211.
        for (int i = 13; i<212; i++){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();


        // 2. way:
        int startingValue = 13;
        while (startingValue<212){
            if (startingValue%4==0 && startingValue%6==0){
                System.out.print(startingValue+ " ");
            }
            startingValue++;
        }






    }
}
