package Week3.Experiment2;

public class Motor {
    private int speed = 0;
    private boolean motorOn = false;
    private final int MAX_SPEED = 100;

    public void startEngine() {
        motorOn = true;
    }

    public void turnOffEngine() {
        motorOn = false;
        speed = 0;
    }

    public void increaseEngine() {
        if (motorOn) {
            if (speed + 5 <= MAX_SPEED) {
                speed += 5;
            } else {
                speed = MAX_SPEED;
            }
        } else {
            System.out.println("Motor cycle Off");
        }
    }

    public void reduceEngine() {
        if (motorOn) {
            speed -= 5;
            if (speed < 0) {
                speed = 0;
            }
        } else {
            System.out.println("Motor cycle Off");
        }
    }

    public void statusPrint() {
        if (motorOn) {
            System.out.println("Motor cycle On");
        } else {
            System.out.println("Motor cycle Off");
        }
        System.out.println("Speed: " + speed + "\n");
    }
}
