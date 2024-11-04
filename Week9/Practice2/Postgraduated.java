package Week9.Practice2;

public class Postgraduated extends Student implements ICumlaude {

    public Postgraduated(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println("I have finished the thesis for Postgraduated");
    }

    @Override
    public void getHighGPA() {
        System.out.println("My GPA is more than 3,71");
    }
}
