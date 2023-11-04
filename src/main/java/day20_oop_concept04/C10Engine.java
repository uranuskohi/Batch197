package day20_oop_concept04;
    /*

            All methods in interface are public and abstract therefore you don't need to use these keywords
            in method declarations.

            1: Interfaces hace abstract methods, which means uncompleted methods.
               Therefore, java will not let us to create an object from interface
            2: "Abstract classes" are just classes and they have constructor. But java does not allow
               abstract classes to create object.
               Interfaces dont have constructor and they have different structure from classes
               We can not create an object from Interfaces.
            3: All methods in Interface are must be overridden by concrete child classes.
               This is why "Interface" are called as "To_Do List"





    */
public interface C10Engine {
    public abstract void start();

    public abstract void stop();

    // Static Concrete Method:
    public static void accelerate(){
        System.out.println("Increase speed so fast.....");
    }

    // Default Concrete Method:
    default void price() {
        System.out.println("Every engine has a price ");
    }

     /*
            Variable in Interface: All variables in interfaces are "final"
                                     1: we have to initialize first
                                     2: we can not change them later
                                     3: for naming convention it should be all in capitals
                                   All variables in interfaces are "public", "final" and "static" as default.
                                   Therefore, we can access them through interface name, (Not through object)

         */

        public final static String ENGINE_NAME = "Electrical Engine";








    }