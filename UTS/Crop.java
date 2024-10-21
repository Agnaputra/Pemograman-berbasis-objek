package UTS;


// Crop Parent Class
abstract class Crop {
    String name;
    int waterNeeds; // Water requirement
    int harvestTime; // Time to harvest in days
    boolean isSick;

    public Crop(String name, int waterNeeds, int harvestTime) {
        this.name = name;
        this.waterNeeds = waterNeeds;
        this.harvestTime = harvestTime;
        this.isSick = false;
    }

    public abstract void grow(); // Abstract method to be implemented by subclasses

    public void water() {
        System.out.println(name + " has been watered.");
    }

    public void harvest() {
        System.out.println(name + " is ready for harvest.");
    }

    public void getSick() {
        isSick = true;
        System.out.println(name + " has fallen sick.");
    }
}
