package Week5.experiment2;

public class Driver {
    private String name;
    private int cost;

    // Default constructor
    public Driver() {
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    // Method to calculate driver cost based on rental days
    public int driverCostCalculation(int days) {
        return cost * days;
    }
}
