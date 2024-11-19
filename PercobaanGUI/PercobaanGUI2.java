package PercobaanGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PercobaanGUI2 extends JFrame {
    private JTabbedPane tabbedPane;
    private JPanel panel1, panel2, panel3;
    private JLabel labelPage1;
    private JTable tablePage2;
    private JTree treePage3;
    private JTextField textFieldPage3;
    private JButton buttonAdd;
    
    public PercobaanGUI2() {
        // Set up the JFrame
        setTitle("Percobaan GUI 2");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Initialize the JTabbedPane
        tabbedPane = new JTabbedPane();
        
        // Create Page 1 with a JLabel
        panel1 = new JPanel();
        labelPage1 = new JLabel("Halaman Pertama");
        panel1.add(labelPage1);
        tabbedPane.addTab("Page 1", panel1);
        
        // Create Page 2 with a JTable
        panel2 = new JPanel();
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        Object[][] data = {
            {"Data 1", "Data 2", "Data 3"},
            {"Data 4", "Data 5", "Data 6"},
            {"Data 7", "Data 8", "Data 9"}
        };
        tablePage2 = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane tableScrollPane = new JScrollPane(tablePage2);
        panel2.add(tableScrollPane);
        tabbedPane.addTab("Page 2", panel2);
        
        // Create Page 3 with a JTree, JTextField, and JButton
        panel3 = new JPanel();
        panel3.setLayout(null); // Using null layout for manual positioning
        
        // JTree setup
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        treePage3 = new JTree(root);
        JScrollPane treeScrollPane = new JScrollPane(treePage3);
        treeScrollPane.setBounds(10, 10, 200, 150);
        panel3.add(treeScrollPane);
        
        // JTextField setup
        textFieldPage3 = new JTextField();
        textFieldPage3.setBounds(220, 10, 150, 25);
        panel3.add(textFieldPage3);
        
        // JButton setup
        buttonAdd = new JButton("Add");
        buttonAdd.setBounds(220, 45, 150, 25);
        panel3.add(buttonAdd);
        
        // Action listener for the button
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textFieldPage3.getText();
                if (!inputText.isEmpty()) {
                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(inputText);
                    DefaultTreeModel model = (DefaultTreeModel) treePage3.getModel();
                    DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
                    root.add(newNode);
                    model.reload();
                    textFieldPage3.setText(""); // Clear input field after adding
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter text to add to the tree.");
                }
            }
        });
        
        // Add panel 3 to the tabbedPane
        tabbedPane.addTab("Page 3", panel3);
        
        // Add the tabbedPane to the JFrame
        add(tabbedPane);
    }
    
    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            PercobaanGUI2 gui = new PercobaanGUI2();
            gui.setVisible(true);
        });
    }
}
