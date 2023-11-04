package day18_oop;
     /*

        How constructors works in inheritance
        1: Java uses constructors from parents classes to inherent child
           Because without having parent we can not create child
        2: Every constructor has invisible "super()" keyword in the first line. If you want
           you can make it visible.
        3: Super() keyword is for calling parent constructor with given parameters.
           you can write parameters inside super to decide which constructor to work
        4: "this()" keyword is used for calling constructor in the same class.
        5: using "super()" and "this()" keyword in object creation provides flexibility
        6: We can create an object which has data type of parent class
        7: if you have a variable with the same name in inheritance,
           value of variable will be selected according to class used as data type
        8: If we use methods with same name in inheritance, the method will be selected from the
           class that constructor is created.
        9: super is used to call variables or methods in the parent class
           this is used to call variables or methods in the same class



    */
     public class C01Animal {
         public String name;
         public int age;
         public boolean isPet;
         public int weight = 12;

         public void  eat() {
             System.out.println("Animals eat.....");
         }



         public C01Animal() {
             this("lol" , 12, true);
             System.out.println("A No Parameters");
         }
         public C01Animal(String name, int age) {
             this();
             System.out.println("String name, int age Parameters");
             this.name = name;
             this.age = age;
         }
         public C01Animal(String name, int age, boolean isPet) {
             super();
             System.out.println("String name, int age, boolean isPet Parameters ");
             this.name = name;
             this.age = age;
             this.isPet = isPet;
         }
     }