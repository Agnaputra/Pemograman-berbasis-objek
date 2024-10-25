package UTS;

class Time {
    int day;

    public Time() {
        day = 0;
    }

    public void nextDay(Land land) {
        day++;
        System.out.println("Day " + day + ": Time is advancing.");
        land.advanceCropsGrowth();
    }
}

