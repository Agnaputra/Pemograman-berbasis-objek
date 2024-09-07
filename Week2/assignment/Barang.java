package Week2.assignment;

public class Barang {
    public String kode;
    public String namaBarang;
    public double hargaDasar;
    public float diskon;  // discount is in percentage

    // Method to calculate selling price
    public double hitungHargaJual() {
        return hargaDasar - (diskon * hargaDasar);
    }

    // Method to display item data
    public void tampilData() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Jual: " + hitungHargaJual());
    }
}
