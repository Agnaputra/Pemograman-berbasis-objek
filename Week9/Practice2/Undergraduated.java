package Week9.Practice2;

public class Undergraduated extends Student implements ICumlaude {
    private double gpa;

    public Undergraduated(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    public void graduate() {
        System.out.println("I have finished the thesis for Undergraduated");
    }

    @Override
    public void getHighGPA() {
        if (this.gpa == 3.1) {
            System.out.println("My GPA is 3,1");
        } else {
            System.out.println("My GPA is more than 3,51");
        }
    }
}
