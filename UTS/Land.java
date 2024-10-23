package UTS;

// Land class
public class Land {
    String soilType;
    int width, height; // Size of the land in grid (width x height)
    String[][] grid; // Visual representation of the land

    public Land(String soilType, int width, int height) {
        this.soilType = soilType;
        this.width = width;
        this.height = height;
        this.grid = new String[height][width]; // Create grid based on size
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = "."; // "." indicates empty land
            }
        }
    }

    public void displayLand() {
        System.out.println("Land layout:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void plant(Crop crop, int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            grid[y][x] = "#"; // "#" indicates planted crop
            System.out.println("Planting " + crop.name + " at (" + x + ", " + y + ").");
        } else {
            System.out.println("Invalid planting location.");
        }
    }

    public void waterLand() {
        System.out.println("The land has been watered.");
    }

    public void fertilize() {
        System.out.println("The land has been fertilized.");
    }
}