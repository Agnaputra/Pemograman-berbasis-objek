package Week5.experiment2;

public class Customer {
    private String name;
    private Car car;
    private Driver driver;
    private int day;

    // Default constructor
    public Customer() {
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getDay() {
        return day;
    }

    // Method to calculate total cost
    public int totalCostCalculation() {
        return car.carCostCalculation(day) + 
        driver.driverCostCalculation(day);
    }
}

