package Week2.experiment2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinola No 1A";
        mhs1.kelas="1A";
        mhs1.tampilanBiodata();
        System.out.println("=========================================");
        // Second object
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Budi";
        mhs2.alamat = "Jl. Anggrek No 2B";
        mhs2.kelas = "1B";
        mhs2.tampilanBiodata();
        System.out.println("=========================================");
        // Third object
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Citra";
        mhs3.alamat = "Jl. Mawar No 3C";
        mhs3.kelas = "1C";
        mhs3.tampilanBiodata();
        System.out.println("=========================================");
        }
    
}