import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginManagementSystem extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    public LoginManagementSystem() {
        // Set up the main frame
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create UI components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        messageLabel = new JLabel();

        // Set up layout
        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(messageLabel);
        add(panel);

        // Add action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Simple credential check (replace with database check in production)
        if ("admin".equals(username) && "password".equals(password)) {
            messageLabel.setText("Login successful!");
            // Open management system frame
            showManagementFrame();
        } else {
            messageLabel.setText("Invalid credentials");
        }
    }

    private void showManagementFrame() {
        JFrame managementFrame = new JFrame("Management System");
        managementFrame.setSize(400, 300);
        managementFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        managementFrame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Welcome to the Management System", SwingConstants.CENTER);
        managementFrame.add(label);
        managementFrame.setVisible(true);

        this.dispose(); // Close the login frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginManagementSystem().setVisible(true));
    }
}