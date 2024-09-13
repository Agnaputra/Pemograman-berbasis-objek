package Week3.Experiment1;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        
        // Print initial status
        motor.statusPrint();
        
        // Attempt to increase speed while motor is off
        motor.increaseSpeed(50);
        
        // Start the motor and increase speed
        motor.startMotor();
        motor.increaseSpeed(50);
        
        // Print status after increasing speed
        motor.statusPrint();
        
        // Stop the motor and reset speed
        motor.stopMotor();
        motor.statusPrint();
    }
}