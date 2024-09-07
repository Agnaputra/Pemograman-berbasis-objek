package Week2.assignment;

public class Lingkaran {
    // Attributes
    public double phi = 3.14;
    public double r;

    // Method to calculate area
    public double hitungLuas() {
        return phi * r * r;
    }

    // Method to calculate circumference
    public double hitungKeliling() {
        return 2 * phi * r;
    }
}

