package Week7.Percobaan1;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    // Setter for lembur
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    // Getter for lembur
    public int getLembur() {
        return lembur;
    }

    // Setter for gajiLembur
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    // Getter for gajiLembur
    public double getGajiLembur() {
        return gajiLembur;
    }

    // Overloaded method to calculate gaji (salary) with lembur and gajiLembur as parameters
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    // Overriding the getGaji method to include lembur calculation
    @Override
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }

    // Method to print information
    public void lihatInfo() {
        System.out.println("NIP           :" + this.getNip());
        System.out.println("Nama          :" + this.getNama());
        System.out.println("Golongan      :" + this.getGolongan());
        System.out.println("Jumlah Lembur :" + this.getLembur());
        System.out.printf("Gaji Lembur   :%.0f\n", this.getGajiLembur());
        System.out.printf("Gaji          :%.0f\n", this.getGaji());
    }
}

