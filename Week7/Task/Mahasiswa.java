package Week7.Task;

// Derived class for Mahasiswa
class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan mi instan.");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar.");
    }
}

