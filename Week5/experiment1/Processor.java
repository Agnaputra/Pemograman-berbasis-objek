package Week5.experiment1;

public class Processor {
    private String brand;
    private double cache;

    // Default constructor
    public Processor() {
    }

    // Parameterized constructor
    public Processor(String brand, double cache) {
        this.brand = brand;
        this.cache = cache;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getCache() {
        return cache;
    }

    // Info method to display the Processor details
    public void info() {
        System.out.printf("Processor Brand: %s\n", brand);
        System.out.printf("Cache Memory: %.2f MB\n", cache);
    }
}
