package UTS;

class Vegetables extends Crop {
    public Vegetables() {
        super("Vegetables", 2, 5);
    }

    @Override
    public void grow() {
        System.out.println("Vegetables are growing.");
    }
}
