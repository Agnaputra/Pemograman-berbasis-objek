package Week1.assignmnet;

public class Chair {
    // Additional attributes
    String material;
    String color;

    // Methods
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void showInfo() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }
}
