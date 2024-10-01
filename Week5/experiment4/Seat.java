package Week5.experiment4;

public class Seat {
    private String number;  // Seat number
    private Passenger passenger;  // Passenger object

    // Constructor for Seat
    public Seat(String number) {
        this.number = number;
        this.passenger = null;  // Initially, no passenger is assigned
    }

    // Setters
    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    // Getters
    public String getNumber() {
        return number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    // Method to display seat and passenger information
    public String info() {
        String info = "";
        info += "Seat Number: " + this.number + "\n";
        if (this.passenger != null) {
            info += "Passenger: " + passenger.info() + "\n";
        } else {
            info += "Seat is unoccupied.\n";
        }
        return info;
    }
}
