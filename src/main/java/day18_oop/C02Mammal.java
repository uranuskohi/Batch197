package day18_oop;

public class C02Mammal extends C01Animal{


    public String type;
    public int height;
    public int weight = 10;

    public void  eat() {
        System.out.println("Mammals eat.....");
    }

    public C02Mammal() {
        this("lol", 12);
        System.out.println("M No Parameters");
    }
    public C02Mammal(String type) {
        this();
        System.out.println("String type Parameters");
        this.type=type;
    }
    public C02Mammal(String type,int height) {
        super();
        System.out.println("String type,int height Parameters");
        this.type=type;
        this.height =height;
    }
}
