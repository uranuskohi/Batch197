package day02_datatypes;

public class C01Variables {
    public static void main(String[] args) {

        byte stdAge = 25;
        System.out.println(stdAge);

        // 3245
        short numOfStdInSchool = 3245;
        System.out.println(numOfStdInSchool);

        //  120000
        int popOfMiami = 120000;
        System.out.println(popOfMiami);

        // If we write long variable in range of an int we need to add "L" to the end.
        // 7000000000
        long popOfWorld = 7000000000L;
        System.out.println(popOfWorld);

        long popOfChina = 1500000000;
        System.out.println(popOfChina);

        float shirtPrice = 23.34F;
        System.out.println(shirtPrice);

        double weightOfCell = 0.000000012;
        System.out.println("weightOfCell = " + weightOfCell);

        boolean isRetired = false;
        System.out.println(isRetired);

        char initial = 'H';
        System.out.println(initial);

        String name = "Mark Twain";
        System.out.println("name = " + name);


    }
}
