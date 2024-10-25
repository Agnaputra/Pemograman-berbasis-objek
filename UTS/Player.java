package UTS;

class Player {
    String name;
    int money;
    int energy;

    public Player(String name, int money, int energy) {
        this.name = name;
        this.money = money;
        this.energy = energy;
    }

    public void rest() {
        energy += 10;
        System.out.println(name + " has rested and gained energy. Current energy: " + energy);
    }

    public void work() {
        if (energy > 0) {
            energy -= 5;
            System.out.println(name + " worked. Energy decreased. Current energy: " + energy);
        } else {
            System.out.println(name + " is too tired to work.");
        }
    }

    public boolean canAfford(int amount) {
        return money >= amount;
    }

    public void spendMoney(int amount) {
        if (canAfford(amount)) {
            money -= amount;
            System.out.println(name + " spent $" + amount + ". Remaining money: $" + money);
        } else {
            System.out.println("Not enough money.");
        }
    }

    public void addMoney(int amount) {
        money += amount;
        System.out.println(name + " earned $" + amount + ". Current balance: $" + money);
    }

    public void showBalance() {
        System.out.println(name + "'s current balance is: $" + money);
    }
}
