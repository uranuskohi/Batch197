package day17_constructors_oop_concept;

public class C03Animal {

        public void eat(){
                System.out.println("Animals eat....");
        }

        public void drink(){
                System.out.println("Animals drink...");
        }

        /*

             1: we create parent_child relation to save common class members into parent class
               i: prevents repetition
               ii: make maintenance easy
               iii: make updating easy
               iv: save time type codes
               v: makes classes as small as possible in size
             2: Access modifiers: public and protected class members can be inherited without any restrictions by child classes
                                  private class members can not be used by child classes
                                  default class members can be inherited inside the same package by child classes
             3: If a child class uses a class member from a parent class ---> inheritance
             4: Object Oriented Programming concept has 4 principle
                    1: Inheritance  2: Polymorphism  3: Encapsulation  4: Abstraction
             5: There are different types of inheritance:
                                                   = Multiple inheritance : Java does not support multiple inheritance
                                                   = Single Inheritance : Java supports single inheritance
                      I: Multilevel inheritance: Java supports multilevel inheritance
                      II: Hierarchical inheritance: Combination of multilevel inheritance
             6: If two classes have "IS A" or "HAS A" relationship, we call them "Covariant" data types.


         */
}
