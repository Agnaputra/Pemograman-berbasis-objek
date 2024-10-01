package Week5.experiment4;

public class Passenger {
    private String identityCard;
    private String name;

    // Constructor with parameters
    public Passenger(String identityCard, String name) {
        this.identityCard = identityCard;
        this.name = name;
    }

    // Setters
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public String getIdentityCard() {
        return identityCard;
    }

    public String getName() {
        return name;
    }

    // Method to display passenger information
    public String info() {
        String info = "";
        info += "Identity Card: " + this.identityCard + "\n";
        info += "Name: " + this.name + "\n";
        return info;
    }
}

