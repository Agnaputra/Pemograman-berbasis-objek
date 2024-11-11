package Week10.Assignment;

public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        // This will be implemented in subclasses
    }

    @Override
    public void destroyed() {
        // This will be implemented in subclasses
    }

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}
