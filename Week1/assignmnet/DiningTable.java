package Week1.assignmnet;

public class DiningTable extends Table {
    // Additional attributes
    int numberOfSeats;
    boolean hasExtendableTop;

    // Methods
    public void setNumberOfSeats(int seats) {
        this.numberOfSeats = seats;
    }

    public void setExtendableTop(boolean extendable) {
        this.hasExtendableTop = extendable;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Has Extendable Top: " + hasExtendableTop);
    }
}
