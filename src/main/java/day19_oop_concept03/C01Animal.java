package day19_oop_concept03;

    /*

        1: To have specific implementation in the child class we use "Method Override"
        2: In Method Overriding we change the method body
           In method overriding we do not change method name and method parameters.
           Method name and method parameters are "Method signature". --> Do not change method signature
        3: In "Method overriding" if the method has void return type do not change it
           In "Method overriding" if the method has "Primitive" return type do not change it
           In "Method overriding" if the method has "Covariant" (Parent_child relationship)return type do not change it
        4: THe method in the child class is "Overriding Method"
           The method in the parent class is "Overridden Method"


          ACCESS MODIFIERS:

        Overridden Method ---> public
        Overriding Method ---> public

        Overridden Method ---> Protected
        Overriding Method ---> protected or public

        Overridden Method ---> default
        Overriding Method ---> default or protected or public

        Overridden Method ---> private
        Overriding Method ---> private methods can not be overridden.

        5:  Polymorphism = Method Overriding( Dynamic Polymorphism) + Method Overloading(Static Polymorphism)
        6: What is the difference between "Method overriding" and "Method overloading"?
           1) "Method overloading" occurs in a single class but for "method overriding" you need more than one class.
           2) "method overriding" uses inheritance "Method overloading" does not
           3) "private access modifiers" can not be overloaded but con not be overridden.
           4) In method overloading we can change method signature but in method overriding we cannot change method signature
           5) In method overriding access modifiers and return types have some rules but method overloading they don't have
           6) "Method overloading" we change parameters of method to work for different scenarios
              "method overriding" we change method body to make method implementation more specific
           7) "static methods" can be overloaded but can not be overridden.


     */
public class C01Animal {


    public void eat(){
        System.out.println("Animals eat....");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }


    public int getWeight(){
        return 10;
    }

    public C01Animal create(){
        C01Animal myAnimal = new C01Animal();
        return myAnimal;
    }

}
