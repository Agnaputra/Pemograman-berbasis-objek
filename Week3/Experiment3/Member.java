package Week3.Experiment3;

public class Member {
    // Attributes (private)
    private String name;
    private String address;
    private float deposit;

    Member (String name, String address) {
        this.name=name;
        this.address=address;
        this.deposit=deposit;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for deposit
    public float getDeposit() {
        return deposit;
    }

    // Method to deposit money
    public void deposit(float money) {
        deposit += money;
    }

    // Method to loan money
    public void loan(float money) {
        deposit -= money;
    }
}
