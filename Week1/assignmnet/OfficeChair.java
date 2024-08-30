package Week1.assignmnet;

public class OfficeChair extends Chair {
    // Attributes
    boolean hasArmrest;
    boolean hasWheels;

    // Methods
    public void setArmrest(boolean hasArmrest) {
        this.hasArmrest = hasArmrest;
    }
    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Has Armrest: " + hasArmrest);
        System.out.println("Has Wheels: " + hasWheels);
    }


}
