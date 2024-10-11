package Week7.Percobaan1;

public class Utama {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");

        // Creating arrays for managers and staff
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        // Creating the first Manager object
        man[0] = new Manager();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");

        // Creating the second Manager object
        man[1] = new Manager();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");

        // Creating the first Staff array for the first Manager
        staff1[0] = new Staff();
        staff1[0].setNama("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new Staff();
        staff1[1].setNama("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(5500);
        man[0].setStaff(staff1);  // Assigning staff1 array to the first Manager

        // Creating the second Staff array for the second Manager
        staff2[0] = new Staff();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);

        staff2[1] = new Staff();
        staff2[1].setNama("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(20);
        staff2[1].setGajiLembur(7000);

        staff2[2] = new Staff();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("5");
        staff2[2].setLembur(18);
        staff2[2].setGajiLembur(8000);

        man[1].setStaff(staff2);  // Assigning staff2 array to the second Manager

        // Displaying information for the first and second managers
        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}

