package Week5.experiment3;

public class MainQuestion {
    public static void main(String[] args) {
        // Create a machinist employee
        Employee machinist = new Employee("1234", "Spongebob Squarepants");

        // Create a railway with only a machinist
        Railway railway = new Railway("Gaya Baru", "Bisnis", machinist);

        // Print the railway information
        System.out.println(railway.info());
    }
}

