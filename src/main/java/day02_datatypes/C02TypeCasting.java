package day02_datatypes;

public class C02TypeCasting {
    public static void main(String[] args) {

        // Type casting is changing primitive dara type of variable to another data type
        byte age =35;
        byte myAge = age;

        // If we change data type of variable into a larger data type. This is called "Auto widening"
        // Java does this operation automatically --> auto widening
        short yourAge = age;
        System.out.println(yourAge);

        // Explicit narrowing: casting larger data type into smaller data type
        //                     java does not do it automatically we need to do it explicitly
        //                     by adding name of smaller data type in front of the variable which has larger data type
        short height = 128 ;
        byte heightOfBuilding = (byte)height;
        System.out.println(heightOfBuilding);

         double height2 = height;
        System.out.println("height2 =" + height2);

        double weight = 79.95;
        short weight1 =(short) weight;
        System.out.println("weight1 = " + weight1);

        // NOTE 1: When doing mathematical operation in java if data types are same, result must have same data type with variables.
        //       The result may not fit to the given data type in this case java will remove decimal parts.
        int numOfStd = 20;
        int amountOfMoney = 398;
        System.out.println(amountOfMoney/ numOfStd);

        // NOTE 2: When doing math operation and if the data types are different the result will be in the same data type with the larger data.
        int numOfStudents = 20;
        float moneyAmount = 398.0F;
        System.out.println(moneyAmount/numOfStudents);











    }
}