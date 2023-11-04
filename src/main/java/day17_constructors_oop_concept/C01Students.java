package day17_constructors_oop_concept;

/*

       1: To create object we need constructor. Without constructor. it is impossible create an objective
       2: When you create a class Java creates constructor automatically.
       3: This invisible constructor is called as "default constructor"
       4: If we want we can create several constructor
       5: When we create a const default const is removed
       6: To create constructors with different parameters make your code flexible

                Question: what is the difference between method and constructor
                          1: methods are used for some actions constructor are used to create an object
                          2: methods have return types but const have no return type
                          3: methods can have any name, But constructors name must be same with the class name

 */
public class C01Students {
    String name = "Tom Hanks";
    int age = 13;
    private String stdId = "TM2010001";
    public void study(){
        System.out.println("Study hard...");
    }
    public void doSport(){
        System.out.println("Doing sports is good for health...");
    }

    // How to create constructor manually
    public C01Students(){
    }


    public C01Students(String name , int age){
        this.name = name;
    }

    // How to create const with help of intellij

    public C01Students(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }
}
