package Week9;

public abstract class Animal {
    private int age;

    protected Animal () {
        this.age = 0;
    }

    public void ageIncreased() {
        this.age += 1;
    }

    public abstract void move();
}