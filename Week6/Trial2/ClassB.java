package Week6.Trial2;

public class ClassB extends ClassA {  // ClassB extends ClassA to inherit x and y
    public int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai z: " + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah: " + (x + y + z));
    }
}
