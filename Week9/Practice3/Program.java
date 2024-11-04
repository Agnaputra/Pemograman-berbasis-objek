package Week9.Practice3;

public class Program {
    public static void main(String[] args) {
        Rector MrRector = new Rector();

        TopStudent student1 = new TopStudent("Alice");
        TopStudent student2 = new TopStudent("Bob");

        MrRector.giveTopStudentCertificate(student1);
        MrRector.giveTopStudentCertificate(student2);
    }
}
