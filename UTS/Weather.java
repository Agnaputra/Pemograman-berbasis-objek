package UTS;

// Weather class
public class Weather {
    String condition;

    public void changeWeather(String condition) {
        this.condition = condition;
        System.out.println("The weather is now " + condition + ".");
    }

    public boolean isRainy() {
        return condition.equals("rainy");
    }
}

