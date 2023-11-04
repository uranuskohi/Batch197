package day18_oop;

public class C03Dog extends C02Mammal{

    public double price;
    public int weight = 8;

    public void  eat() {
        System.out.println("Dogs eat.....");
    }


    public C03Dog() {
        super();
        System.out.println("super var: -->" + super.weight);
        System.out.println("this var: -->" + this.weight);
        System.out.println("D no parameters");
    }


    public C03Dog(double price) {
        super();
        System.out.println("Price parameter");
        this.price = price;
    }

}
