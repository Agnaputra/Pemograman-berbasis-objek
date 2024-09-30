package Week5;

public class Computer {
    private String brand;
    private Processor proc;  // Processor object

    // Default constructor
    public Computer() {
    }

    // Parameterized constructor
    public Computer(String brand, Processor proc) {
        this.brand = brand;
        this.proc = proc;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public Processor getProc() {
        return proc;
    }

    // Info method to display the Computer and its Processor details
    public void info() {
        System.out.println("Computer Brand: " + brand);
        proc.info();
    }
}
