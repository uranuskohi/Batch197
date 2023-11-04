package day20_oop_concept04;

public abstract class C03Animal {

    /*

        1) Concrete Method: Method with body
           Abstract Method: Method without body

        2) To make a method abstract:
          :remove method body
          :add "abstract" keyword between access modifier and return type
          :add "abstract" keyword before class keyword
        3) If a method made abstract all concrete child classes must override it
          :An abstract class can have concrete methods. Child classes does not have to override them.

        4) Java does not allow us to create objects from Abstract classes
          :"Abstract Classes" have some methods without body. This makes object
          :has some problems, missing a method body. If a method is not complete
          :it can not perform some operations.

        5) Abstract methods do not have to be overridden in abstract child classes
           Abstract methods have to be overridden in Concrete child classes

        6) If an abstract method is overridden by a concrete child class it is not mandatory
           child classes of concrete class to override that method.

        7) "Abstract classes" can have both abstract and concrete methods.
           "Concrete classes" can have only concrete methods

        8) "Abstract methods" can have "public" and "protected" and "default" access modifiers.
           "Abstract methods" can not have "private" access modifiers.

        9) Final method: Final means you can not update it.
           Can we declare abstract method as final?
           No because final methods can not be updated.
           Can we override to a final method?
           No.

        10) Can we make an abstract method static?


     */
    public abstract void eat();


    public void drink() {
        System.out.println("Animals drink...");
    }











}
