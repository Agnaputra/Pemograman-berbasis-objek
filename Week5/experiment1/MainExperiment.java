package Week5.experiment1;

public class MainExperiment {
    public static void main(String[] args) {
        // Create a Processor object
        Processor p = new Processor("Intel i5", 3.0);

        // Create a Computer object with a Processor
        Computer L = new Computer("ThinkPad", p);

        // Display the info
        L.info();

        // Another way to create and set values
        Processor p1 = new Processor();
        p1.setBrand("Intel i7");
        p1.setCache(4.0);

        Computer c1 = new Computer();
        c1.setBrand("Dell XPS");
        c1.setProc(p1);
        c1.info();
    }
}
