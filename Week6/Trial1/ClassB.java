package Week6.Trial1;

public class ClassB extends ClassA {  // ClassB now extends ClassA
    public int z;

    public void getNilaiZ() {
        System.out.println("nilai z:" + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah:" + (x + y + z));
    }
}
