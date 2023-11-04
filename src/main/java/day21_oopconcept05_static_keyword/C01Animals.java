package day21_oopconcept05_static_keyword;

        /*

         Child                parent
         class                class      ------> we use "extends"
         class                interface   ------> we use "implements"
         interface            interface   ------> we use "extends"
         interface            class     -----> It is impossible for interface to inherent from class.


         *** What is the difference between Abstract class and Interface?

         1: Methods: "Abstract class" can use concrete and abstract methods.
                     "Interface" can use only "abstract" methods
                      Note: by using "static" or "default" keyword we can create concrete methods in Interface.
                            If we use "static" keyword we can call them by name of the Interface.
                            If we use "default" keyword we need to create an object to call them
                    : All methods in interface are public , but in abstract class they can be public, protected,or default.
         2: Variables: Access modifier of variables in interface are public,Static and final,
          but in abstract class it can have any access modifier.
         3: Java does not support multiple inheritance. If you need to use multiple inheritance use Interface.
         4: If we need to use multiple inheritance with some compulsory methods we use interface.

         Example: When we need to use multiple browsers in our software, create Browser interface and determine
                the obligatory methods that will be used by different browsers.

        */
public interface C01Animals {

    void eat();


}
