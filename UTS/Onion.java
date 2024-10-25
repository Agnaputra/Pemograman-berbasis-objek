package UTS;

class Onion extends Crop {
    public Onion() {
        super("Onion", 3, 6);
    }

    @Override
    public void grow() {
        System.out.println("Onion is growing.");
    }
}
