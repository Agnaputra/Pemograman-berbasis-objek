package Week6.Trial2;

public class Percobaan2 {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        hitung.setX(20);  // Inherited from ClassA
        hitung.setY(30);  // Inherited from ClassA
        hitung.setZ(5);   // Specific to ClassB
        
        hitung.getNilai();  // Inherited method from ClassA
        hitung.getNilaiZ(); // Method in ClassB
        hitung.getJumlah(); // Method in ClassB
    }
}
