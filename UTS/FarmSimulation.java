package UTS;
import java.util.Scanner;

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
            if (grid[y][x].equals(".")) { // Check if the space is empty
                grid[y][x] = "#"; // "#" indicates planted crop
                crops[y][x] = crop; // Track the planted crop
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
                grid[y][x] = "."; // Remove the crop after harvest
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
                    crops[i][j].advanceGrowth(); // Advance growth for all crops
                }
            }
        }
    }

    public void upgradeLand(int newWidth, int newHeight) {
        // Check if the new size is larger than the current size
        if (newWidth > width && newHeight > height) {
            // Create a new grid and crops array with the new dimensions
            String[][] newGrid = new String[newHeight][newWidth];
            Crop[][] newCrops = new Crop[newHeight][newWidth];

            // Copy old data to new grid
            for (int i = 0; i < height; i++) {
                System.arraycopy(grid[i], 0, newGrid[i], 0, width);
                newCrops[i] = crops[i].clone(); // Cloning crops array
            }

            // Initialize the remaining cells in the new grid
            for (int i = 0; i < newHeight; i++) {
                for (int j = 0; j < newWidth; j++) {
                    if (i >= height || j >= width) {
                        newGrid[i][j] = ".";
                        newCrops[i][j] = null;
                    }
                }
            }

            // Update land properties
            grid = newGrid;
            crops = newCrops;
            width = newWidth;
            height = newHeight;

            System.out.println("Land upgraded to " + newWidth + "x" + newHeight + "!");
        } else {
            System.out.println("New dimensions must be larger than the current land.");
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

    public void nextDay(Land land) {
        day++;
        System.out.println("Day " + day + ": Time is advancing.");
        land.advanceCropsGrowth(); // Advance the growth of crops with each day
    }
}

// Weather class
class Weather {
    String condition;

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

    public Player(int money, int energy) {
        this.money = money;
        this.energy = energy;
    }

    public void rest() {
        energy += 10;
        System.out.println("Player has rested and gained energy. Current energy: " + energy);
    }

    public void work() {
        if (energy > 0) {
            energy -= 5;
            System.out.println("Player worked. Energy decreased. Current energy: " + energy);
        } else {
            System.out.println("Player is too tired to work.");
        }
    }

    public boolean canAfford(int amount) {
        return money >= amount;
    }

    public void spendMoney(int amount) {
        if (canAfford(amount)) {
            money -= amount;
            System.out.println("You spent $" + amount + ". Remaining money: $" + money);
        } else {
            System.out.println("Not enough money.");
        }
    }

    public void addMoney(int amount) {
        money += amount;
        System.out.println("You earned $" + amount + ". Current balance: $" + money);
    }

    public void showBalance() {
        System.out.println("Your current balance is: $" + money);
    }
}

// Main Simulation Class
public class FarmSimulation {
    public static void main(String[] args) {
        // Initial game setup
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(100, 50); // Player starts with $100 and 50 energy
        Land farmLand = null; // Land starts as null until bought
        Time gameTime = new Time();
        Weather weather = new Weather();
        Store store = new Store();
        boolean running = true;

        while (running) {
            player.showBalance(); // Display player's money at the start of each loop
            System.out.println("\n=== Farm Simulation ===");
            System.out.println("1. Buy land");
            System.out.println("2. Plant crops");
            System.out.println("3. Water the land");
            System.out.println("4. Fertilize the land");
            System.out.println("5. Harvest crops");
            System.out.println("6. Sell harvested crops");
            System.out.println("7. Rest");
            System.out.println("8. Work");
            System.out.println("9. Check weather");
            System.out.println("10. Next day");
            System.out.println("11. Exit");
            System.out.println("12. Upgrade land"); // New option
            System.out.print("Choose an action: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Buy land
                    if (farmLand == null) {
                        farmLand = new Land("loamy", 3, 3); // Buying initial land of size 3x3
                        System.out.println("You have bought land!");
                    } else {
                        System.out.println("You already own land.");
                    }
                    break;

                case 2: // Plant crops
                    if (farmLand != null) {
                        System.out.println("Choose crop to plant:");
                        System.out.println("1. Sugar Cane");
                        System.out.println("2. Onion");
                        System.out.println("3. Vegetables");
                        int cropChoice = scanner.nextInt();
                        Crop crop = null;

                        switch (cropChoice) {
                            case 1:
                                crop = new SugarCane();
                                break;
                            case 2:
                                crop = new Onion();
                                break;
                            case 3:
                                crop = new Vegetables();
                                break;
                            default:
                                System.out.println("Invalid crop choice.");
                                break;
                        }

                        if (crop != null) {
                            System.out.println("Enter coordinates to plant (x y): ");
                            int x = scanner.nextInt();
                            int y = scanner.nextInt();
                            farmLand.plant(crop, x, y);
                        }
                    } else {
                        System.out.println("You need to buy land first.");
                    }
                    break;

                case 3: // Water the land
                    if (farmLand != null) {
                        farmLand.waterLand();
                    } else {
                        System.out.println("You need to buy land first.");
                    }
                    break;

                case 4: // Fertilize the land
                    if (farmLand != null) {
                        farmLand.fertilize();
                    } else {
                        System.out.println("You need to buy land first.");
                    }
                    break;

                case 5: // Harvest crops
                    if (farmLand != null) {
                        System.out.println("Enter coordinates to harvest (x y): ");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        farmLand.harvestCrop(x, y);
                    } else {
                        System.out.println("You need to buy land first.");
                    }
                    break;

                case 6: // Sell harvested crops
                    if (farmLand != null) {
                        // Here you would implement selling logic based on what crops have been harvested
                        System.out.println("Selling harvested crops...");
                    } else {
                        System.out.println("You need to buy land first.");
                    }
                    break;

                case 7: // Rest
                    player.rest();
                    break;

                case 8: // Work
                    player.work();
                    break;

                case 9: // Check weather
                    System.out.println("Current weather: " + weather.condition);
                    break;

                case 10: // Next day
                    gameTime.nextDay(farmLand);
                    break;

                case 11: // Exit
                    running = false;
                    break;

                case 12: // Upgrade land
                    if (farmLand != null) {
                        System.out.println("Choose new land size to upgrade:");
                        System.out.println("1. 4x4 land ($100)");
                        System.out.println("2. 5x5 land ($200)");
                        int upgradeChoice = scanner.nextInt();

                        int newWidth = 0, newHeight = 0, cost = 0;

                        if (upgradeChoice == 1) {
                            newWidth = 4;
                            newHeight = 4;
                            cost = 100;
                        } else if (upgradeChoice == 2) {
                            newWidth = 5;
                            newHeight = 5;
                            cost = 200;
                        } else {
                            System.out.println("Invalid choice.");
                            break;
                        }

                        if (player.canAfford(cost)) {
                            player.spendMoney(cost);
                            farmLand.upgradeLand(newWidth, newHeight); // Call upgrade method
                            farmLand.displayLand(); // Show updated land
                        } else {
                            System.out.println("Not enough money to upgrade land.");
                        }
                    } else {
                        System.out.println("You need to buy land first.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for playing!");
    }
}
