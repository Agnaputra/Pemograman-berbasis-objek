package Week6.Assignment;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 120000; // Assuming a rate for each SKS

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}

