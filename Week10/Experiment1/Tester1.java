package Week10.Experiment1;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e;
        Payable p;

        e = pEmp;  // Employee reference to PermanentEmployee
        System.out.println(e.getEmployeeInfo());

        e = iEmp;  // Employee reference to InternshipEmployee
        System.out.println(e.getEmployeeInfo());

        p = pEmp;  // Payable reference to PermanentEmployee
        System.out.println("Payment amount for PermanentEmployee: " + p.getPaymentAmount());

        p = eBill;  // Payable reference to ElectricityBill
        System.out.println("Payment amount for ElectricityBill: " + p.getPaymentAmount());
        
        // The following lines would cause errors if uncommented:
        // p = iEmp;  // Error: InternshipEmployee does not implement Payable
        // e = eBill; // Error: ElectricityBill is not an Employee
    }
}
