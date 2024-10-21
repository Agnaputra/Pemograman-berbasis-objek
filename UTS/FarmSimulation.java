package UTS;
import java.util.Scanner;
// Main Simulation Class
public class FarmSimulation {
    public static void main(String[] args) {
        // Initial game setup
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(100, 50);
        Land farmLand = new Land("Loamy", 100);
        Time gameTime = new Time();
        Weather weather = new Weather();
        Store store = new Store();
        
        // Create crops
        Crop sugarCane = new SugarCane();
        Crop onion = new Onion();
        Crop vegetables = new Vegetables();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Farm Simulation ===");
            System.out.println("1. Plant crops");
            System.out.println("2. Water the land");
            System.out.println("3. Fertilize the land");
            System.out.println("4. Rest");
            System.out.println("5. Work");
            System.out.println("6. Sell harvested crops");
            System.out.println("7. Check weather");
            System.out.println("8. Next day");
            System.out.println("9. Exit");
            System.out.print("Choose an action: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose a crop to plant:");
                    System.out.println("1. Sugar Cane");
                    System.out.println("2. Onion");
                    System.out.println("3. Vegetables");
                    int plantChoice = scanner.nextInt();
                    switch (plantChoice) {
                        case 1:
                            farmLand.plant(sugarCane);
                            sugarCane.grow();
                            break;
                        case 2:
                            farmLand.plant(onion);
                            onion.grow();
                            break;
                        case 3:
                            farmLand.plant(vegetables);
                            vegetables.grow();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 2:
                    farmLand.waterLand();
                    break;
                case 3:
                    farmLand.fertilize();
                    break;
                case 4:
                    player.rest();
                    break;
                case 5:
                    player.work();
                    break;
                case 6:
                    System.out.println("Choose a crop to sell:");
                    System.out.println("1. Sugar Cane ($15)");
                    System.out.println("2. Onion ($10)");
                    System.out.println("3. Vegetables ($12)");
                    int sellChoice = scanner.nextInt();
                    switch (sellChoice) {
                        case 1:
                            store.sellItem("Sugar Cane", 15);
                            break;
                        case 2:
                            store.sellItem("Onion", 10);
                            break;
                        case 3:
                            store.sellItem("Vegetables", 12);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 7:
                    System.out.println("Current weather: " + weather.condition);
                    System.out.print("Change weather (e.g., 'sunny', 'rainy'): ");
                    String newWeather = scanner.next();
                    weather.changeWeather(newWeather);
                    break;
                case 8:
                    gameTime.nextDay();
                    break;
                case 9:
                    running = false;
                    System.out.println("Exiting the game.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

