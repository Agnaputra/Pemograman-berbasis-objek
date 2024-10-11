package Week7.Task;

// Derived class for Dosen
class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan makanan sehat.");
    }

    public void lembur() {
        System.out.println("Dosen lembur mengoreksi tugas.");
    }
}
