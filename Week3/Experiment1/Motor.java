package Week3.Experiment1;

public class Motor {
    // Encapsulate the attributes
    private int speed = 0;
    private boolean motorOn = false;

    // Method to start the motor
    public void startMotor() {
        motorOn = true;
        System.out.println("Motor is now ON.");
    }

    // Method to stop the motor
    public void stopMotor() {
        motorOn = false;
        speed = 0; // Reset speed when motor is off
        System.out.println("Motor is now OFF.");
    }

    // Method to increase speed
    public void increaseSpeed(int increment) {
        if (motorOn) {
            speed += increment;
            System.out.println("Speed increased by " + increment + " km/h. Current speed: " + speed);
        } else {
            System.out.println("Cannot increase speed. Motor is OFF.");
        }
    }

    // Method to print motor status
    public void statusPrint() {
        if (motorOn) {
            System.out.println("Motor is ON.");
        } else {
            System.out.println("Motor is OFF.");
        }
        System.out.println("Current speed: " + speed + " km/h\n");
    }
}
