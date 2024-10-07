package Week6.Assignment;

public class Main {
    public static void main(String[] args) {
        // Create DaftarGaji instance
        DaftarGaji daftarGaji = new DaftarGaji(2);

        // Create a Dosen object and set its SKS
        Dosen dosen1 = new Dosen("001", "Dr. Amin Sumarno", "Jl. Sudirman No. 1");
        dosen1.setSKS(10); // Setting the SKS

        // Add Dosen to DaftarGaji
        daftarGaji.addPegawai(dosen1);

        // Create another Dosen
        Dosen dosen2 = new Dosen("002", "Dr. Retno Suyatni", "Jl. Thamrin No. 2");
        dosen2.setSKS(8); // Setting the SKS

        // Add second Dosen to DaftarGaji
        daftarGaji.addPegawai(dosen2);

        // Print all employees' names and their salaries
        daftarGaji.printSemuaGaji();
    }
}
