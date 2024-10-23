package UTS;

// Crop Parent Class
abstract class Crop {
    String name;
    int waterNeeds; // Water requirement
    int harvestTime; // Time to harvest in days
    boolean isSick;
    boolean isHarvested;
    int growthStage; // Tracks the growth of the crop

    public Crop(String name, int waterNeeds, int harvestTime) {
        this.name = name;
        this.waterNeeds = waterNeeds;
        this.harvestTime = harvestTime;
        this.isSick = false;
        this.isHarvested = false;
        this.growthStage = 0; // Start with growth stage 0
    }

    public abstract void grow(); // Abstract method to be implemented by subclasses

    public void water() {
        System.out.println(name + " has been watered.");
    }

    public void harvest() {
        if (!isHarvested) {
            isHarvested = true;
            System.out.println(name + " has been harvested.");
        } else {
            System.out.println(name + " has already been harvested.");
        }
    }

    public void advanceGrowth() {
        if (growthStage < 3) {
            growthStage++;
            System.out.println(name + " has grown. Current stage: " + growthStage + "/3.");
        } else {
            System.out.println(name + " is fully grown and ready to harvest!");
        }
    }

    public boolean isReadyForSale() {
        return isHarvested;
    }
}
