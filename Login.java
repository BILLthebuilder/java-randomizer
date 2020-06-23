import javax.swing.*;


public class Login {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JTextField userText = new JTextField(20);
    JLabel userLabel = new JLabel("User");
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField password = new JPasswordField(20);
    
    Login() {
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        password.setBounds(100, 20, 165, 25);
        panel.add(password);
        
        frame.setVisible(true);
    }
    
    public static void main(String args[]) {
        new Login(); 
    }
    
}
