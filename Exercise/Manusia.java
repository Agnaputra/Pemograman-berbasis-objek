package Exercise;

public class Manusia { 
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvJadul = (TelevisiJadul) perangkat;
            // Set the mode to "DVI"
            System.out.println("Nyalakan televisi jadul dengan input: " + tvJadul.getModeInput());
            System.out.println("Voltase televisi: " + tvJadul.getVoltase());
        } else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvModern = (TelevisiModern) perangkat;
            System.out.println("Nyalakan televisi modern dengan input: " + tvModern.getModeInput());
            System.out.println("Voltase televisi: " + tvModern.getVoltase());
        }
    }
}