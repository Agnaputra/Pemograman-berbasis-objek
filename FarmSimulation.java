import java.util.Scanner;
// Main Simulation Class
public class FarmSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial game setup
        System.out.print("Enter your player name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(100, 50); // Player starts with $100 and 50 energy
        Land farmLand = null; // Land starts as null until bought
        Time gameTime = new Time();
        Weather weather = new Weather();
        Store store = new Store();

        boolean running = true; // Game loop
        while (running) {
            // Show welcome message and player stats
            System.out.println("\n=======================================");
            System.out.println("Welcome to the Farm Simulation, " + playerName + "!");
            player.showBalance();
            player.showEnergy();
            if (farmLand != null) {
                farmLand.displayLand(); // Show farm layout if land is bought
            } else {
                System.out.println("You don't have any land yet.");
            }
            System.out.println("Weather: " + (weather.condition != null ? weather.condition : "clear"));

            // Display menu options
            System.out.println("Choose an option:");
            System.out.println("1. Buy Land");
            System.out.println("2. Plant Crop");
            System.out.println("3. Water Crops");
            System.out.println("4. Fertilize Land");
            System.out.println("5. Next Day");
            System.out.println("6. Sell Harvested Crops");
            System.out.println("7. Check Weather");
            System.out.println("8. Rest");
            System.out.println("9. Exit Game");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Buy Land
                    if (player.canAfford(50)) { // Land costs $50
                        farmLand = new Land("Loamy", 3, 3); // Create new land
                        player.spendMoney(50); // Deduct money from player
                        System.out.println("You have bought the land!");
                    } else {
                        System.out.println("Not enough money to buy land.");
                    }
                    break;

                case 2: // Plant Crop
                    if (farmLand != null) {
                        System.out.print("Enter crop type (1: SugarCane, 2: Onion, 3: Vegetables): ");
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
                                System.out.println("Invalid crop type.");
                                break;
                        }
                        if (crop != null) {
                            System.out.print("Enter x-coordinate to plant (0-" + (farmLand.width - 1) + "): ");
                            int x = scanner.nextInt();
                            System.out.print("Enter y-coordinate to plant (0-" + (farmLand.height - 1) + "): ");
                            int y = scanner.nextInt();
                            farmLand.plant(crop, x, y); // Plant the selected crop
                        }
                    } else {
                        System.out.println("You need to buy land first!");
                    }
                    break;

                case 3: // Water Crops
                    if (farmLand != null) {
                        farmLand.waterLand(); // Water the crops
                    } else {
                        System.out.println("You need to buy land first!");
                    }
                    break;

                case 4: // Fertilize Land
                    if (farmLand != null) {
                        farmLand.fertilize(); // Fertilize the land
                    } else {
                        System.out.println("You need to buy land first!");
                    }
                    break;

                case 5: // Next Day
                    if (farmLand != null) {
                        gameTime.nextDay(farmLand); // Advance to the next day
                    } else {
                        System.out.println("You need to buy land first!");
                    }
                    break;

                case 6: // Sell harvested crops
                    if (farmLand != null) {
                        System.out.print("Enter x-coordinate to sell crop (0-" + (farmLand.width - 1) + "): ");
                        int x = scanner.nextInt();
                        System.out.print("Enter y-coordinate to sell crop (0-" + (farmLand.height - 1) + "): ");
                        int y = scanner.nextInt();
                        Crop cropToSell = farmLand.getCrops()[y][x];
                        if (cropToSell != null && cropToSell.isReadyForSale()) {
                            player.addMoney(20); // Assuming selling price is $20
                            farmLand.harvestCrop(x, y); // Harvest the crop before selling
                        } else {
                            System.out.println("No crop to sell or crop is not ready for sale.");
                        }
                    } else {
                        System.out.println("You need to buy land first!");
                    }
                    break;

                case 7: // Check Weather
                    System.out.print("Enter new weather condition (clear/rainy): ");
                    String condition = scanner.next();
                    weather.changeWeather(condition); // Change weather condition
                    break;

                case 8: // Rest
                    player.rest(); // Player rests to regain energy
                    break;

                case 9: // Exit Game
                    System.out.println("Thank you for playing!");
                    running = false; // Exit the game loop
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); // Close scanner resource
    }
}
