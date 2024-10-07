package Week6.Assignment;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int size) {
        listPegawai = new Pegawai[size];
        index = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (index < listPegawai.length) {
            listPegawai[index] = pegawai;
            index++;
        } else {
            System.out.println("List is full, cannot add more Pegawai");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < index; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("Nama: " + pegawai.getNama() + ", Gaji: " + pegawai.getGaji());
        }
    }
}