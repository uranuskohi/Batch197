package day20_oop_concept04;

public class CarRunner {
    public static void main(String[] args) {

        C13Honda myHonda = new C13Honda();
        myHonda.price();// Price() is a concrete method in interface. It is "Default Concrete Method"
                        // to access default concrete method we need object


        C10Engine.accelerate(); // Accelerate() is a concrete method in interface. It is "Static Concrete Method"
                                // to access static concrete method we use class name.
        // static methods sticks on class, default methods sticks on object

        System.out.println("C10Engine.ENGINE_NAME = " + C10Engine.ENGINE_NAME);


    }
}
