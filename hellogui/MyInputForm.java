package hellogui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("My Input Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
    }
    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0"); // Default value

        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0"); // Default value
    }
    private void createButton() {
        button = new JButton("Calculate"); // Button labeled "Calculate"

        // Event listener for the button
        class AddInterestListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                
                    int a = Integer.valueOf(aField.getText()); // Get input from the first text field
                    int b = Integer.valueOf(bField.getText()); // Get input from the second text field
                    int e = a * b; // Calculate the product
                    cLabel.setText("Hasil: " + e); // Display the result in the label
                    }
                }      
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);      
    }
    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);

        add(panel); // Add panel to the frame
    }
    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
