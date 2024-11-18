package hellogui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputFormModify extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton multiplyButton;
    private JButton addButton; // New button for addition
    private JPanel panel;

    public MyInputFormModify() {
        createTextField();
        createButtons(); // Updated to create both buttons
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

    private void createButtons() {
        // Button for multiplication
        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    int a = Integer.valueOf(aField.getText()); // Get input from the first text field
                    int b = Integer.valueOf(bField.getText()); // Get input from the second text field
                    int result = a * b; // Calculate the product
                    cLabel.setText("Hasil: " + result); // Display the result in the label
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(MyInputFormModify.this, 
                        "Please enter valid integers!", 
                        "Input Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Button for addition
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    int a = Integer.valueOf(aField.getText()); // Get input from the first text field
                    int b = Integer.valueOf(bField.getText()); // Get input from the second text field
                    int result = a + b; // Calculate the sum
                    cLabel.setText("Hasil: " + result); // Display the result in the label
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(MyInputFormModify.this, 
                        "Please enter valid integers!", 
                        "Input Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(multiplyButton); // Add the "Multiply" button
        panel.add(addButton);      // Add the "Add" button
        panel.add(cLabel);

        add(panel); // Add panel to the frame
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputFormModify();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
