package hellogui.ManajemenLayout;

import javax.swing.*;
import java.awt.*;

public class Box extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel panel;

    // Constructor for Box Layout Demo
    public Box() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical alignment (Y_AXIS)

        // Add buttons to the panel
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));

        // Add the panel to the frame
        add(panel);

        // Set frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Box Layout Demo");
        
    }
}

