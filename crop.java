// Crop Parent Class
abstract class Crop {
    String name;
    int waterNeeds; // Water requirement
    int harvestTime; // Time to harvest in days
    boolean isSick;
    boolean isHarvested;
    int growthStage; // Tracks the growth of the crop

    // Constructor for Crop class
    public Crop(String name, int waterNeeds, int harvestTime) {
        this.name = name;
        this.waterNeeds = waterNeeds;
        this.harvestTime = harvestTime;
        this.isSick = false;
        this.isHarvested = false;
        this.growthStage = 0; // Start with growth stage 0
    }

    public abstract void grow(); // Abstract method to be implemented by subclasses

    // Watering the crop
    public void water() {
        System.out.println(name + " has been watered.");
    }

    // Harvesting the crop
    public void harvest() {
        if (!isHarvested) {
            isHarvested = true;
            System.out.println(name + " has been harvested.");
        } else {
            System.out.println(name + " has already been harvested.");
        }
    }

    // Advancing growth stage of the crop
    public void advanceGrowth() {
        if (growthStage < 3) {
            growthStage++;
            System.out.println(name + " has grown. Current stage: " + growthStage + "/3.");
        } else {
            System.out.println(name + " is fully grown and ready to harvest!");
        }
    }

    // Check if the crop is ready for sale
    public boolean isReadyForSale() {
        return isHarvested;
    }
}

// SugarCane class inherits from Crop
class SugarCane extends Crop {
    public SugarCane() {
        super("Sugar Cane", 4, 12); // Sugar Cane needs 4 units of water and 12 days to harvest
    }

    @Override
    public void grow() {
        System.out.println("Sugar Cane is growing.");
    }
}

// Onion class inherits from Crop
class Onion extends Crop {
    public Onion() {
        super("Onion", 3, 6); // Onion needs 3 units of water and 6 days to harvest
    }

    @Override
    public void grow() {
        System.out.println("Onion is growing.");
    }
}

// Vegetables class inherits from Crop
class Vegetables extends Crop {
    public Vegetables() {
        super("Vegetables", 2, 5); // Vegetables need 2 units of water and 5 days to harvest
    }

    @Override
    public void grow() {
        System.out.println("Vegetables are growing.");
    }
}

// Land class
class Land {
    String soilType;
    int width, height; // Size of the land in grid (width x height)
    String[][] grid; // Visual representation of the land
    Crop[][] crops; // Tracks crops planted on land

    // Constructor for Land class
    public Land(String soilType, int width, int height) {
        this.soilType = soilType;
        this.width = width;
        this.height = height;
        this.grid = new String[height][width]; // Create grid based on size
        this.crops = new Crop[height][width]; // Array to track crops
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = "."; // "." indicates empty land
            }
        }
    }

    // Display the layout of the land
    public void displayLand() {
        System.out.println("=== Farm Layout (3D Effect) ===");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print((crops[i][j] != null ? "# " : ". ") + " "); // "#" for planted crops
            }
            System.out.println();
        }
    }

    // Planting a crop
    public void plant(Crop crop, int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            if (grid[y][x].equals(".")) { // Check if the space is empty
                grid[y][x] = "#"; // "#" indicates planted crop
                crops[y][x] = crop; // Track the planted crop
                System.out.println("Planted " + crop.name + " at (" + x + ", " + y + ").");
            } else {
                System.out.println("There is already something planted here.");
            }
        } else {
            System.out.println("Invalid planting location.");
        }
    }

    // Harvesting a crop
    public void harvestCrop(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            Crop crop = crops[y][x];
            if (crop != null && !crop.isHarvested) {
                crop.harvest();
                grid[y][x] = "."; // Remove the crop after harvest and set land back to empty
                System.out.println(crop.name + " has been harvested and sold.");
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

    // Advance the growth of all crops on the land
    public void advanceCropsGrowth() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (crops[i][j] != null) {
                    crops[i][j].advanceGrowth(); // Advance growth for all crops
                }
            }
        }
    }

    public Crop[][] getCrops() {
        return crops;
    }
}

// Time class
class Time {
    int day;

    public Time() {
        day = 0;
    }

    // Move to the next day in the simulation
    public void nextDay(Land land) {
        day++;
        System.out.println("Day " + day + ": Time is advancing.");
        land.advanceCropsGrowth(); // Advance the growth of crops with each day
    }
}

// Weather class
class Weather {
    String condition;

    // Change the weather condition
    public void changeWeather(String condition) {
        this.condition = condition;
        System.out.println("The weather is now " + condition + ".");
    }

    public boolean isRainy() {
        return condition.equals("rainy");
    }
}

// Store class
class Store {
    public void sellItem(String item, int price) {
        System.out.println("Selling " + item + " for $" + price);
    }

    public void buyItem(String item, int price) {
        System.out.println("Buying " + item + " for $" + price);
    }
}

// Player class
class Player {
    int money;
    int energy;

    // Constructor for Player class
    public Player(int money, int energy) {
        this.money = money;
        this.energy = energy;
    }

    // Player resting to regain energy
    public void rest() {
        energy += 10;
        System.out.println("Player has rested and gained energy. Current energy: " + energy);
    }

    // Player working which decreases energy
    public void work() {
        if (energy > 0) {
            energy -= 5;
            System.out.println("Player worked. Energy decreased. Current energy: " + energy);
        } else {
            System.out.println("Player is too tired to work.");
        }
    }

    // Check if player can afford an item
    public boolean canAfford(int amount) {
        return money >= amount;
    }

    // Spend money on items
    public void spendMoney(int amount) {
        if (canAfford(amount)) {
            money -= amount;
            System.out.println("You spent $" + amount + ". Remaining money: $" + money);
        } else {
            System.out.println("Not enough money.");
        }
    }

    // Add money to the player's balance
    public void addMoney(int amount) {
        money += amount;
        System.out.println("You earned $" + amount + ". Current balance: $" + money);
    }

    // Show current balance
    public void showBalance() {
        System.out.println("Your current balance is: $" + money);
    }

    // Show current energy
    public void showEnergy() {
        System.out.println("Current energy: " + energy);
    }
}

