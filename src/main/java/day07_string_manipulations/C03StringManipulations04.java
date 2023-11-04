package day07_string_manipulations;

public class C03StringManipulations04 {
    public static void main(String[] args) {

        // Example 4:Check if a password has the following conditions
        //          i)It should not be empty
        //          ii)It should not be just space
        //          iii)It should not have spaces at the beginning and at the end
        //          iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        //          v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        //           HW : at index 4 there should be 'i'

        String password = "Ar0%iK3";
        //          i)It should not be empty
        boolean first = password.isEmpty();
        System.out.println(first);

        //          ii)It should not be just space
        boolean second = password.isBlank();
        System.out.println(second);


        //          iii)It should not have spaces at the beginning and at the end
        boolean third = password.trim().equals(password);
        System.out.println(password);

        //          iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        boolean fourth = password.indexOf("i")== 4;
        System.out.println(fourth);

        //          v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        boolean fifth = password.lastIndexOf("K") == 5;
        System.out.println(fifth);

        // First way to give message:
        if (!first & !second && third && fourth && fifth){
            System.out.println("Your password is valid...");
        } else {
            System.out.println("Your Password is invalid...");
        }



        // second way:
        if (first){
            System.out.println("Password can not be empty...");
        }
        if (second){
            System.out.println("Password can not be blank");
        }
        if (!third){
            System.out.println("Password cannot start and end with space...");
        }
        if (!fourth){
            System.out.println("'i' should be fifth char in the string...");
        }
        if (!fifth){
            System.out.println("'K' should be sixth char in the string...");
        }
        if (!first & !second && third && fourth && fifth){
            System.out.println("Your password is valid...");
        } else {
            System.out.println("Your Password is invalid...");
        }

    }
}
