package day20_oop_concept04;

public abstract class Practice {
    private String myName = "URANUS";
    private int myAge = 20;
    private boolean alive = true;

    public String getMyName() {
        return myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract void eat();
}
