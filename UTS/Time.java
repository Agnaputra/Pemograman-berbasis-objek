package UTS;

// Time class
public class Time {
    int day;

    public Time() {
        day = 0;
    }

    public void nextDay() {
        day++;
        System.out.println("Day " + day + ": Time is advancing.");
    }
}

