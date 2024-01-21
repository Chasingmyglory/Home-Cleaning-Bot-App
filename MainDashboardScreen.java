package frontEndGUI;


import javax.swing.*;
import java.awt.*;

public class MainDashboardScreen extends JFrame {

    public MainDashboardScreen() {
        // Frame Title
        setTitle("Main Dashboard");

        // Frame configuration
        setSize(500, 400); // Set the size of the dashboard window
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation

        // Layout for the frame
        setLayout(new BorderLayout());

        // Add new robot button
        JButton addRobotButton = new JButton("Add Robot");

        // Display area for the home layout map
        // This can be a JPanel with a background image or a custom component for more complex behavior
        JPanel mapPanel = new JPanel();
        mapPanel.setBackground(Color.LIGHT_GRAY); // Placeholder for the map

        // Cleaning mode selection
        String[] cleaningModes = {"Auto", "Custom"};
        JComboBox<String> modeComboBox = new JComboBox<>(cleaningModes);

        // Start button to initiate cleaning
        JButton startButton = new JButton("Start Cleaning");

        // Panel for robot management
        JPanel robotManagementPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        robotManagementPanel.add(addRobotButton);
        robotManagementPanel.add(new JLabel("Select Mode:"));
        robotManagementPanel.add(modeComboBox);
        robotManagementPanel.add(startButton);

        // Add panels to frame
        add(robotManagementPanel, BorderLayout.NORTH);
        add(mapPanel, BorderLayout.CENTER); // Map would be in the center

        // Action listeners for buttons
        addRobotButton.addActionListener(e -> {
            // TODO: Implement logic for adding a new robot
        });

        startButton.addActionListener(e -> {
            // TODO: Implement logic to start cleaning with the selected mode
            String selectedMode = (String) modeComboBox.getSelectedItem();
            System.out.println("Cleaning started in " + selectedMode + " mode.");
        });

        // Make the frame visible
        setVisible(true);
    }

   
}

