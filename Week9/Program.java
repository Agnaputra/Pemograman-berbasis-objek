package Week9;

public class Program {
    public static void main(String[] args) {
        Cat asiaCat = new Cat();
        Fish dolphin = new Fish();
        
        People john = new People("John");
        People ben = new People("Ben");

        john.setPet(asiaCat);
        ben.setPet(dolphin);  

        john.takePetToWalk();
        ben.takePetToWalk();  
    }
}