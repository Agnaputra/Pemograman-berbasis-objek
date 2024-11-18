package hellogui.ManajemenLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel panel;

    // Constructor for Grid Layout Demo
    public Grid() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2)); // Set a 4x2 grid layout

        // Add buttons to each grid cell
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));

        // Add panel to the JFrame
        add(panel);

        // Frame properties
        setTitle("Grid Layout Demo");
        setSize(FRAME_WIDTH, FRAME_HEIGHT); // Set preferred size for this demo
    }
    public static void main(String[] args) {
        JFrame frame = new Grid();
        frame.setVisible(true); // Make the frame visible
    }
}