package frontEndGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    // Class member variables for text fields
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    public LoginScreen() {
        // Frame Title
        setTitle("Login");

        // Layout
        setLayout(new BorderLayout());
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame

        // Username label and text field
        JPanel usernamePanel = new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField(15); // Initialize class member
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameTextField);

        // Password label and text field
        JPanel passwordPanel = new JPanel();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15); // Initialize class member
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        // Login button
        JPanel buttonPanel = new JPanel();
        JButton loginButton = new JButton("Login");
        buttonPanel.add(loginButton);

        // Add panels to frame
        add(usernamePanel, BorderLayout.NORTH);
        add(passwordPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Action for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = new String(passwordField.getPassword());

                // Dummy check for username and password
                if ("sam".equals(username) && "123".equals(password)) {
                    // If credentials are valid, show the main dashboard
                    showMainDashboard();
                } else {
                    // If credentials are invalid, show an error message
                    JOptionPane.showMessageDialog(LoginScreen.this, "Invalid credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 // Method to switch to the MainDashboardScreen
    private void showMainDashboard() {
        // Hide the login window
        this.setVisible(false);
        this.dispose(); // Release all window resources

        // Create and show the main dashboard
        MainDashboardScreen mainDashboard = new MainDashboardScreen();
        mainDashboard.setVisible(true);
    }

    
}
