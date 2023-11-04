package day19_oop_concept03;

public class C03Dog extends C02Mammal {


    @Override //   "@Override" Annotation: checks for override rules.
    public void eat() {
        System.out.println("Arlo eats...");
    }

    @Override
    public void drink() {
        System.out.println("Arlo drinks...");
    }

    @Override
    public int getWeight() {
        return 70;
    }

    @Override
    public C02Mammal create() {
        return new C03Dog();
    }













}
