package Week9.Practice2;

public class Rector {
    public void giveCumlaudeCertificate(ICumlaude student) {
        System.out.println("I am a Rector, give a Cumlaude Certificate");
        System.out.println("Congratulations! Please introduce yourself ..");

        // Check if the student is an instance of Student
        if (student instanceof Student) {
            Student s = (Student) student;
            s.studyInCampus();
        }

        student.graduate();
        student.getHighGPA();

        System.out.println("================================================");
    }
}
