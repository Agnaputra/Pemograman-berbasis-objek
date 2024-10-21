package UTS;

// Player class
public class Player {
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
}


