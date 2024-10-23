package UTS;

 // Onion class inherits from Crop
public class Onion extends Crop {
    public Onion() {
        super("Onion", 3, 6); // Onion needs 3 units of water and 6 days to harvest
    }

    @Override
    public void grow() {
        System.out.println("Onion is growing.");
    }
}
