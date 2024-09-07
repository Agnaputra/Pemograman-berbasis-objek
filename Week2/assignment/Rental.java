package Week2.assignment;

public class Rental {
    // Attributes
    int id;
    String memberName;
    String gameName;
    int rentalDays;
    double pricePerDay;

    // Method to calculate the amount
    public double calculateAmount() {
        return rentalDays * pricePerDay;
    }

    // Method to display rental data
    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Price per Day: " + pricePerDay);
        System.out.println("Total Amount: " + calculateAmount());
    }
}
