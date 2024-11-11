package Week10.Assignment;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.2;
            case 2 -> health += health * 0.3;
            case 3 -> health += health * 0.4;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.02;
    }
}
