package Week10.Experiment1;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        // Array of Employee objects
        Employee[] e = {pEmp, iEmp};  // Only includes Employee objects (pEmp and iEmp)

        // Array of Payable objects
        Payable[] p = {pEmp, eBill};  // Only includes Payable objects (pEmp and eBill)

        // The following line would cause an error, as eBill is not an Employee:
        Employee[] e2 = {pEmp, iEmp, eBill}; // ERROR: eBill is not an Employee
    }
}
