package day17_constructors_oop_concept;

public class C02Student_Runner {
    public static void main(String[] args) {

        C01Students std1 = new C01Students();
        System.out.println(std1.name);

        C01Students std2 = new C01Students("Cagatay" , 14);
        std1.name = "Emre";
        std1.age = 12;
        System.out.println(std2.name);

        std1.doSport();
        std1.study();
        std2.study();

    }
}
