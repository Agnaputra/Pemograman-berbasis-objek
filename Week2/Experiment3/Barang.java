package Week2.Experiment3;

public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang () {
    System.out.println ("Nama Barang: "+namaBrg);
    System.out.println ("Jenis Barang: "+jenisBrg);
    System.out.println ("Stok "+stok);
    }
    
    //method dengan argumen dan nilai balik (return)
    // This method returns the new stock (int) after adding the incoming stock
    public int tambahStok (int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;  // returning the computed new stock value
    }

}