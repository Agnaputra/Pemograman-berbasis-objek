package Week10.Assignment;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.3;
            case 2 -> health += health * 0.4;
            case 3 -> health += health * 0.5;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.01;
    }
}

