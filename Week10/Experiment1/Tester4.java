package Week10.Experiment1;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");

        // Pay for electricity bill
        ow.pay(eBill);
        System.out.println();

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);

        // Pay for permanent employee
        ow.pay(pEmp);
        System.out.println();

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);

        // Show permanent employee info
        ow.showMyEmployee(pEmp);
        System.out.println();

        // Show internship employee info
        ow.showMyEmployee(iEmp);
    }
}
