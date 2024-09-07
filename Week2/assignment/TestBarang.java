package Week2.assignment;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "B001";
        brg1.namaBarang = "Laptop";
        brg1.hargaDasar = 9000000;  // 9 million rupiah
        brg1.diskon = 0.1f;  // 10% discount
        
        brg1.tampilData();
    }
}
