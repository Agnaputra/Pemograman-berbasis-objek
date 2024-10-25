package UTS;

class Land {
    String soilType;
    int width, height;
    String[][] grid;
    Crop[][] crops;

    public Land(String soilType, int width, int height) {
        this.soilType = soilType;
        this.width = width;
        this.height = height;
        initializeLand();
    }

    private void initializeLand() {
        grid = new String[height][width];
        crops = new Crop[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = ".";
            }
        }
    }

    public void expandLand(int additionalWidth, int additionalHeight) {
        width += additionalWidth;
        height += additionalHeight;
        initializeLand();
        System.out.println("Land has been expanded! New size: " + width + "x" + height);
    }

    public void displayLand() {
        System.out.println("=== Farm Layout ===");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (crops[i][j] != null) {
                    System.out.print("/^\\");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

    public void plant(Crop crop, int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            if (grid[y][x].equals(".")) {
                grid[y][x] = "#";
                crops[y][x] = crop;
                System.out.println("Planting " + crop.name + " at (" + x + ", " + y + ").");
            } else {
                System.out.println("There is already something planted here.");
            }
        } else {
            System.out.println("Invalid planting location.");
        }
    }

    public void harvestCrop(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            Crop crop = crops[y][x];
            if (crop != null && !crop.isHarvested) {
                crop.harvest();
                grid[y][x] = ".";
            } else {
                System.out.println("No crop to harvest at this location or already harvested.");
            }
        } else {
            System.out.println("Invalid location.");
        }
    }

    public void waterLand() {
        System.out.println("The land has been watered.");
    }

    public void fertilize() {
        System.out.println("The land has been fertilized.");
    }

    public void advanceCropsGrowth() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (crops[i][j] != null) {
                    crops[i][j].advanceGrowth();
                }
            }
        }
    }

    public Crop[][] getCrops() {
        return crops;
    }
}