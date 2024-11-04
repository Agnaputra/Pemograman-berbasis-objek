package Week9.Practice3;

public class TopStudent implements IAchievement {
    private String name;

    public TopStudent(String name) {
        this.name = name;
    }

    @Override
    public void winCompetition() {
        System.out.println("I have won an INTERNATIONAL competition");
    }

    @Override
    public void publishArticles() {
        System.out.println("I publish articles in INTERNATIONAL journals");
    }
}
