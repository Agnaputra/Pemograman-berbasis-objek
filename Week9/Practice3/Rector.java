package Week9.Practice3;

public class Rector {
    public void giveTopStudentCertificate(IAchievement student) {
        System.out.println("I am a Rector, give a Certificate of Top Student.");
        System.out.println("Congratulations! How you can get achievement?");
        
        student.winCompetition();
        student.publishArticles();
        
        System.out.println("================================================");
    }
}