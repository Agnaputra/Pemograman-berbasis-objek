package Week5.experiment3;

public class MainExperiment3 {
    public static void main(String[] args) {
        // Create machinist and assistant employees
        Employee machinist = new Employee("1234", "Spongebob Squarepants");
        Employee assistant = new Employee("4567", "Patrick Star");

        // Create railway with machinist and assistant
        Railway railwayWithAssistant = new Railway("Gaya Baru", "Business", machinist, assistant);

        // Print info about railway with machinist and assistant
        System.out.println(railwayWithAssistant.info());

        // Create railway with only a machinist
        Railway railwayWithoutAssistant = new Railway("Gaya Baru", "Business", machinist);

        // Print info about railway without assistant
        System.out.println(railwayWithoutAssistant.info());
    }
}
