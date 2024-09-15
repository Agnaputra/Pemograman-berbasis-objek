package Week3.Task;

public class Member {
    private String ktpNumber;
    private String name;
    private int loanLimit;
    private int loanAmount;

    public Member(String ktpNumber, String name, int loanLimit) {
        this.ktpNumber = ktpNumber;
        this.name = name;
        this.loanLimit = loanLimit;
        this.loanAmount = 0;
    }

    public String getKtpNumber() {
        return ktpNumber;
    }

    public String getName() {
        return name;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int amount) {
        if (loanAmount + amount <= loanLimit) {
            loanAmount += amount;
        } else {
            System.out.println("Sorry, cannot borrow more than the loan limit.");
        }
    }

    public void installments(int amount) {
        if (amount < loanAmount * 0.1) {
            System.out.println("Sorry, installments must be 10% of the loan amount.");
        } else if (amount <= loanAmount) {
            loanAmount -= amount;
        } else {
            System.out.println("Sorry, cannot pay more than the loan amount.");
        }
    }
    
}
