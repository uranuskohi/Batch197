package day21_oopconcept05_static_keyword;

public class C06Student {
    /*
           What is the difference between "static" and "Non_static" keyword?
             1: "Static class" members are common for all object, "Non_static" class members are shared only
                by the object itself.
             2: When we make updates on "Static class" members the update will affect all object
                When we make updates on "Non_static" class members the update will affect only the specific object
                If we want other object to be informed we need to type code
             3: To access "static" members we need only class name
                To access "Non_static" members we need to create object
             4: Static class members are created together with class.
                Non_static class members are created while we are creating on object
             5: Static class members are created once. non_static class members are created in every
                object creation

     */

    public static int numOfStudents = 0;
    public int numOfEyes = 0;

    public C06Student(){
        this.numOfEyes = numOfEyes +2;
        numOfStudents++;
    }
}
