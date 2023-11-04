package practice_dt.practice01;

public class Practice01 {
    public static void main(String[] args) {

        //Initialize variable
        // data type - variable name - assignment operator - value - ;
        int          age                 =   12   ;
        byte         customerAge         =   35   ;
        double       weight              =   87.5 ;


        //Uninitialized variable;
        String name;
        String stdName = "Tom";
        System.out.println("stdName is:" + stdName);

        //Print variables with label

        System.out.println("Age is: " + age);
        System.out.println("Customer age: " + customerAge);
        System.out.println("Weight is:" + weight);
        //Java gives error if we donot instanciate the variable

        System.out.println("Weight is:" + weight);

        // Copy the variable value
        byte myAge = (byte) age;
        System.out.println("myAge =" + myAge);


        double age3 = age;
        System.out.println("age3= " + age3);

        //Declare multipul variable in the same line
        short year =2023, month =9, day =28;

        //Update a variable

        month =12;
        System.out.println("month = " + month);

        // Declare a variable: x
        int x;

        int z = 40;
        x = z;
        System.out.println(x);





    }
}