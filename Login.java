import javax.swing.*;


public class Login {
    JPanel panel = new JPanel();
    JPanel dashboard = new JPanel();
    JFrame frame = new JFrame();
    JFrame frame2 = new JFrame();
    JLabel dashmessage = new JLabel();
    JTextField userText = new JTextField(20);
    JLabel userLabel = new JLabel("User");
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField password = new JPasswordField(20);
    JButton button = new JButton("Login");
    
    Login() {
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame2.add(dashboard);
        panel.setLayout(null);
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        password.setBounds(100, 50, 165, 25);
        panel.add(password);

        button.setBounds(10, 80, 80, 25);
        panel.add(button);
        
        dashmessage.setText("Welcome");
        dashmessage.setBounds(10, 20, 80, 25);
        dashboard.add(dashmessage);
        frame.setVisible(true);
    }
    
    public static void main(String args[]) {
        new Login(); 
    }
    
}
