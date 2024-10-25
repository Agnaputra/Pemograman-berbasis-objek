package UTS;

class SugarCane extends Crop {
    public SugarCane() {
        super("Sugar Cane", 4, 12);
    }

    @Override
    public void grow() {
        System.out.println("Sugar Cane is growing.");
    }
}