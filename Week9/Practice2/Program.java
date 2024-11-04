package Week9.Practice2;

public class Program {
    public static void main(String[] args) {
        Rector MrRector = new Rector();

        Undergraduated ordinaryStudent = new Undergraduated("Charlie", 3.1); // Modify "ordinaryStudent" to be an Undergraduated instance
        Undergraduated undergraduatedCumlaude = new Undergraduated("Joe", 3.6);
        Postgraduated postgraduatedCumlaude = new Postgraduated("Ben");

        MrRector.giveCumlaudeCertificate(ordinaryStudent);
        MrRector.giveCumlaudeCertificate(undergraduatedCumlaude);
        MrRector.giveCumlaudeCertificate(postgraduatedCumlaude);
    }
}
