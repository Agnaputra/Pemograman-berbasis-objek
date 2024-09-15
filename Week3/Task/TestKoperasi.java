package Week3.Task;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter KTP number: ");
        String ktp = scanner.nextLine();
        System.out.println("===============================================");
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("===============================================");

        System.out.print("Enter loan limit: ");
        int loanLimit = scanner.nextInt();
        
        Member donny = new Member(ktp, name, loanLimit);
        
        System.out.println("Member name: " + donny.getName());
        System.out.println("Loan limit: " + donny.getLoanLimit());
        System.out.println("===============================================");
        
        System.out.print("Enter amount to borrow: ");
        int borrowAmount = scanner.nextInt();
        System.out.println("===============================================");

        donny.borrow(borrowAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());
        System.out.println("===============================================");
        
        System.out.print("Enter installment amount: ");
        int installmentAmount = scanner.nextInt();
        System.out.println("===============================================");
        
        donny.installments(installmentAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());
        
        scanner.close();
    }
}

