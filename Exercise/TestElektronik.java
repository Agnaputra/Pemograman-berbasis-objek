package Exercise;

public class TestElektronik {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul();
        TelevisiModern tvModern = new TelevisiModern();

        manusia.nyalakanPerangkat(tvJadul);
        manusia.nyalakanPerangkat(tvModern);
    }
}