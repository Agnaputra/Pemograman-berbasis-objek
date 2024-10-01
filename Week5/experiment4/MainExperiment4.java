package Week5.experiment4;

public class MainExperiment4 {
    public static void main(String[] args) {
        // Create a passenger
        Passenger passenger1 = new Passenger("12345", "Mr. Krab");

        Carriage carriage = new Carriage("A", 10);

        carriage.setPassenger(passenger1, 1);

        System.out.println(carriage.info());

        Passenger budi = new Passenger("67890", "Budi");
        carriage.setPassenger(budi, 2);  // Assigns Budi to seat 2

        System.out.println(carriage.info());

        Passenger anotherPassenger = new Passenger("11223", "Joko");
        carriage.setPassenger(anotherPassenger, 2);  // Will print "Seat 2 is already occupied."


    }
}
