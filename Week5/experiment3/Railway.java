package Week5.experiment3;

public class Railway {
    private String name;
    private String railwayClass;
    private Employee machinist;  // Machinist is an Employee
    private Employee assistant;  // Assistant is also an Employee (optional)

    // Constructor with machinist only
    public Railway(String name, String railwayClass, Employee machinist) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = null;  // No assistant assigned
    }

    // Constructor with machinist and assistant
    public Railway(String name, String railwayClass, Employee machinist, Employee assistant) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = assistant;
    }

    // Setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRailwayClass(String railwayClass) {
        this.railwayClass = railwayClass;
    }

    public String getRailwayClass() {
        return railwayClass;
    }

    public void setMachinist(Employee machinist) {
        this.machinist = machinist;
    }

    public Employee getMachinist() {
        return machinist;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

    // Method to display railway info
    public String info() {
        String info = "";
        info += "Train Name: " + this.name + "\n";
        info += "Railway Class: " + this.railwayClass + "\n";
        info += "Machinist: " + this.machinist.info() + "\n";

        if (this.assistant != null) {
            info += "Assistant: " + this.assistant.info() + "\n";
        } else {
            info += "No Assistant Assigned\n";
        }

        return info;
    }
}
