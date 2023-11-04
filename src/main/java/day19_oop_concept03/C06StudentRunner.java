package day19_oop_concept03;

public class C06StudentRunner {
    public static void main(String[] args) {

        C05Student std = new C05Student();
        System.out.println("std.getStId() = " + std.getStId()); // TH001
        System.out.println(std.getGpa());
        std.setStId("AC234");
        System.out.println(std.getStId()); //AC234




    }
}