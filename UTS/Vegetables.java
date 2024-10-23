package UTS;

// Vegetables class inherits from Crop
public class Vegetables extends Crop {
    public Vegetables() {
        super("Vegetables", 2, 5); // Vegetables need 2 units of water and 5 days to harvest
    }

    @Override
    public void grow() {
        System.out.println("Vegetables are growing.");
    }
}