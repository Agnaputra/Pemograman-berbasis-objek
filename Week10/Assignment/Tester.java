package Week10.Assignment;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println("Walking Zombie Data =\n" + wz.getZombieInfo());
        System.out.println("Jumping Zombie Data =\n" + jz.getZombieInfo());
        System.out.println("Barrier Strength = " + b.getBarrierInfo());

    System.out.println("-----------------------------------------------------------");

        // Simulate attacks
        for (int i = 0; i < 4; i++) { // Destroy enemies 4 times
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }

        System.out.println("Walking Zombie Data =\n" + wz.getZombieInfo());
        System.out.println("Jumping Zombie Data =\n" + jz.getZombieInfo());
        System.out.println("Barrier Strength = " + b.getBarrierInfo());
    }
}
