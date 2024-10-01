package Week5.experiment3;

public class Employee {
    private String identityNumber;
    private String name;

    // Constructor with parameters
    public Employee(String identityNumber, String name) {
        this.identityNumber = identityNumber;
        this.name = name;
    }

    // Setters
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getName() {
        return name;
    }

    // Method to display employee info
    public String info() {
        String info = "";
        info += "Identity Number: " + this.identityNumber + "\n";
        info += "Name: " + this.name + "\n";
        return info;
    }
}
