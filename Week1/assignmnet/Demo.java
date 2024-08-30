package Week1.assignmnet;

public class Demo {
    public static void main(String[] args) {
        Table myTable = new Table();
        DiningTable myDiningTable = new DiningTable();
        Chair myChair = new Chair();
        OfficeChair myOfficeChair = new OfficeChair();
        // Instantiate objects
        
        myTable.setMaterial("Wood");
        myTable.setColor("Brown");

        
        myDiningTable.setMaterial("Glass");
        myDiningTable.setColor("Transparent");
        myDiningTable.setNumberOfSeats(6);
        myDiningTable.setExtendableTop(true);

        
        myChair.setMaterial("Steel");
        myChair.setColor("Black");

        myOfficeChair.setMaterial("Plastic");
        myOfficeChair.setColor("Blue");
        myOfficeChair.setArmrest(true);
        myOfficeChair.setHasWheels(true);

        // Show information of each object
        System.out.println("Table Info:");
        myTable.showInfo();

        System.out.println("\nDining Table Info:");
        myDiningTable.showInfo();

        System.out.println("\nChair Info:");
        myChair.showInfo();

        System.out.println("\nOffice Chair Info:");
        myOfficeChair.showInfo();
    }











}
