package day20_oop_concept04;

public class C01A {

    /*

        1) Create class A
        2) Create class B
        3) Create a String, an int, and a boolean variable inside the class A and encapsulate them all
        4) Make String variable just readable
        5) Make int variable just updatable
        6) Make Boolean variable both readable and updatable

     */

    private String name = "URANUS";
    private int age = 20;
    private boolean isAlive = true;


    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
