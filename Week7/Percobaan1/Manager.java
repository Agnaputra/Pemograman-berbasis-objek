package Week7.Percobaan1;

public class Manager extends Karyawan {
    // Fields specific to Manager
    private double tunjangan;
    private String bagian;
    private Staff st[] ;

    // Method to set tunjangan (allowance)
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Method to get tunjangan
    public double getTunjangan() {
        return tunjangan;
    }

    // Method to set bagian (department/section)
    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    // Method to get bagian
    public String getBagian() {
        return bagian;
    }

    // Method to set Staff array
    public void setStaff(Staff st []) {
        this.st = st;
    }

    // Method to view staff details
    public void viewStaff() {
        int i;
        System.out.println("------------------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("------------------------------");
    }

    // Method to view manager information
    public void lihatInfo() {
        System.out.println("Manager   :" + this.getBagian());
        System.out.println("NIP       :" + this.getNip());
        System.out.println("Nama      :" + this.getNama());
        System.out.println("Golongan  :" + this.getGolongan());
        System.out.println("Tunjangan : Rp." + this.getTunjangan());
        System.out.println("Gaji      : Rp." + this.getGaji());
        this.viewStaff();
    }

    // Overriding the getGaji method to include tunjangan
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}

