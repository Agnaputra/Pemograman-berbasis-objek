package Week7.Task;

class Segitiga {
    private int sudut;

    // Constructor
    public Segitiga() {
        sudut = 180; // A triangle's total interior angles is always 180 degrees
    }

    // Overloaded methods for calculating remaining angles
    public int totalSudut(int sudutA) {
        return sudut - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut - (sudutA + sudutB);
    }

    // Overloaded methods for calculating the perimeter (keliling) of the triangle
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        // Using Pythagoras theorem for a right-angled triangle
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // Test overloaded totalSudut methods
        System.out.println("Total sudut with 1 known angle: " + segitiga.totalSudut(90));
        System.out.println("Total sudut with 2 known angles: " + segitiga.totalSudut(60, 30));

        // Test overloaded keliling methods
        System.out.println("Keliling with 3 sides: " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (hypotenuse) with 2 sides: " + segitiga.keliling(3, 4));
    }
}
