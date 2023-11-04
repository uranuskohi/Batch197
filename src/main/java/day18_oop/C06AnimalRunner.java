package day18_oop;

public class C06AnimalRunner {
    public static void main(String[] args) {

        C01Animal myDog = new C02Mammal();
        System.out.println("myDog.weight = " + myDog.weight);
        myDog.eat();


    }
}
