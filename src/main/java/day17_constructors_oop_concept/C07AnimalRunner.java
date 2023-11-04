package day17_constructors_oop_concept;

public class C07AnimalRunner {
    public static void main(String[] args) {

        C04Cats myCat = new C04Cats();
        myCat.eat();
        myCat.drink();
        myCat.meow();
        System.out.println();


        C05Dogs myDog = new C05Dogs();
        myDog.drink();
        myDog.eat();
        myDog.bark();
        System.out.println();


        C06Birds myBird = new C06Birds();
        myBird.drink();
        myBird.eat();
        myBird.tweet();
        System.out.println();

    }
}
