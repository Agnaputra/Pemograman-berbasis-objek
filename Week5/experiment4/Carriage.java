package Week5.experiment4;

public class Carriage {
    private String code;  // Carriage code
    private Seat[] seatArray;  // Array of Seat objects

    // Constructor for Carriage
    public Carriage(String code, int seatCount) {
        this.code = code;
        this.seatArray = new Seat[seatCount];  // Initialize the seat array with given count
        this.seatInit();  // Initialize seat numbers
    }

    // Method to initialize seats
    private void seatInit() {
        for (int i = 0; i < seatArray.length; i++) {
            this.seatArray[i] = new Seat(String.valueOf(i + 1));  // Assign seat numbers
        }
    }

    // Setters and Getters
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Seat[] getSeatArray() {
        return seatArray;
    }

    // Method to assign a passenger to a specific seat
    public void setPassenger(Passenger passenger, int seatNumber) {
        if (seatNumber > 0 && seatNumber <= seatArray.length) {
            if (seatArray[seatNumber - 1].getPassenger() == null) {
                seatArray[seatNumber - 1].setPassenger(passenger);
            } else {
                System.out.println("Seat " + seatNumber + " is already occupied.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }
    }
    

    // Method to display carriage info
    public String info() {
        String info = "Carriage Code: " + code + "\n";
        for (Seat seat : seatArray) {
            info += seat.info();
        }
        return info;
    }
}
