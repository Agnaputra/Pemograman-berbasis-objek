package Week10.Experiment1;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;

        // Menggunakan referensi 'e' untuk memanggil getEmployeeInfo
        e = pEmp;
        System.out.println(e.getEmployeeInfo());
        System.out.println("-------------------------------------------------");
        // Memanggil getEmployeeInfo langsung melalui referensi pEmp
        System.out.println(pEmp.getEmployeeInfo());
    }
}
