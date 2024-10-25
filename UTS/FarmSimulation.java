package UTS;
import java.util.Scanner;

public class FarmSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your player name: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName, 100, 50);
        Land farmLand = null;
        Time gameTime = new Time();
        Weather weather = new Weather();
        Store store = new Store();

        Crop sugarCane = new SugarCane();
        Crop onion = new Onion();
        Crop vegetables = new Vegetables();

        boolean running = true;

        while (running) {
            System.out.println("\n=======================================");
            System.out.println("       WELCOME TO FARM SIMULATION      ");
            System.out.println("=======================================");
            System.out.println("Player: " + playerName);
            player.showBalance();
            System.out.println("Energy: " + player.energy);
            System.out.println("\nActions:");
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
            System.out.print("Choose an action: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (player.canAfford(50)) {
                        player.spendMoney(50);
                        if (farmLand == null) {
                            farmLand = new Land("Fertile Soil", 5, 3);
                            System.out.println("You have bought land.");
                        } else {
                            farmLand.expandLand(2, 1);
                        }
                    } else {
                        System.out.println("Not enough money to buy land.");
                    }
                    break;
                case 2:
                    if (farmLand != null) {
                        System.out.println("Choose a crop to plant:");
                        System.out.println("1. Sugar Cane");
                        System.out.println("2. Onion");
                        System.out.println("3. Vegetables");
                        int cropChoice = scanner.nextInt();
                        Crop crop = switch (cropChoice) {
                            case 1 -> sugarCane;
                            case 2 -> onion;
                            case 3 -> vegetables;
                            default -> null;
                        };
                        System.out.println("Enter x, y coordinates (e.g., 1 1): ");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        if (crop != null) {
                            farmLand.plant(crop, x, y);
                        }
                    } else {
                        System.out.println("You must buy land first.");
                    }
                    break;
                case 3:
                    if (farmLand != null) {
                        farmLand.waterLand();
                    }
                    break;
                case 4:
                    if (farmLand != null) {
                        farmLand.fertilize();
                    }
                    break;
                case 5:
                    if (farmLand != null) {
                        System.out.println("Enter coordinates of crop to harvest:");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        farmLand.harvestCrop(x, y);
                    }
                    break;
                    case 6: // Sell harvested crops
                    if (farmLand != null) {
                        Crop[][] crops = farmLand.getCrops();
                        int totalEarned = 0;
                        for (int i = 0; i < crops.length; i++) {
                            for (int j = 0; j < crops[i].length; j++) {
                                if (crops[i][j] != null && crops[i][j].isReadyForSale()) {
                                    if (crops[i][j] instanceof SugarCane) {
                                        totalEarned += 15;
                                    } else if (crops[i][j] instanceof Onion) {
                                        totalEarned += 10;
                                    } else if (crops[i][j] instanceof Vegetables) {
                                        totalEarned += 12;
                                    }
                                    crops[i][j] = null; // Hapus tanaman setelah dijual
                                    farmLand.grid[i][j] = "."; // Perbarui visual grid lahan
                                }
                            }
                        }
                        if (totalEarned > 0) {
                            player.addMoney(totalEarned);
                            System.out.println("You sold harvested crops and earned $" + totalEarned);
                            farmLand.displayLand(); // Tampilkan grid lahan yang diperbarui
                        } else {
                            System.out.println("No crops ready for sale.");
                        }
                    } else {
                        System.out.println("You need to buy land first.");
                    }
                    break;
                
                case 7:
                    player.rest();
                    break;
                case 8:
                    player.work(); // Energy decreases when working
                    break;
                case 9:
                    System.out.println("The current weather is sunny.");
                    break;
                case 10:
                    gameTime.nextDay(farmLand);
                    break;
                case 11:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (farmLand != null) {
                farmLand.displayLand();
            }
        }
        scanner.close();
    }
}