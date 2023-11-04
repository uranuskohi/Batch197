package day20_oop_concept04;

public class C13Honda implements C10Engine,C11Security,C12Ac {

    @Override
    public void start() {
        System.out.println("Honda start");
    }

    @Override
    public void stop() {
        System.out.println("Honda stop");
    }

    @Override
    public void brake() {

    }

    @Override
    public void abs() {

    }

    @Override
    public void digital() {

    }

    @Override
    public void climate() {

    }

    @Override
    public void antiBacterial() {

    }
}
