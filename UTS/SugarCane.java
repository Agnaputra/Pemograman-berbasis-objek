package UTS;

// SugarCane class inherits from Crop
public class SugarCane extends Crop {
    public SugarCane() {
        super("Sugar Cane", 4, 12); // Sugar Cane needs 4 units of water and 12 days to harvest
    }

    @Override
    public void grow() {
        System.out.println("Sugar Cane is growing.");
    }
}
