package UTS;

// Land class
class Land {
    String soilType;
    int size; // Size of the land in square meters

    public Land(String soilType, int size) {
        this.soilType = soilType;
        this.size = size;
    }

    public void plant(Crop crop) {
        System.out.println("Planting " + crop.name + " on the land.");
    }

    public void waterLand() {
        System.out.println("The land has been watered.");
    }

    public void fertilize() {
        System.out.println("The land has been fertilized.");
    }
}
