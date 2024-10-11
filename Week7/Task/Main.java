package Week7.Task;

public class Main {
    public static void main(String[] args) {
        
        Manusia manusia1 = new Dosen(); 
        Manusia manusia2 = new Mahasiswa();

        // Dynamic dispatch: correct method is called based on the actual object type
        manusia1.bernapas();
        manusia1.makan();  // Calls Dosen's overridden method

        manusia2.bernapas();
        manusia2.makan();  // Calls Mahasiswa's overridden method

        // Cast to call specific methods of Dosen and Mahasiswa
        Dosen dosen = (Dosen) manusia1;
        dosen.lembur();

        Mahasiswa mahasiswa = (Mahasiswa) manusia2;
        mahasiswa.tidur();
    }
}


