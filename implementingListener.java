import java.awt.*;
import java.awt.event.*;

public class implementingListener extends Frame implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    TextField myTextField;
    Label myLabel;

    implementingListener() {
        myTextField = new TextField();
        myTextField.setBounds(60, 50, 270, 20);
        myLabel = new Label();
        myLabel.setBounds(30, 80, 300, 30);
        Button b = new Button("Click me");
        b.setBounds(100, 120, 170, 30);

        myLabel.setText("I'm a label");
        b.addActionListener(this);
        add(b);
        add(myTextField);
        add(myLabel);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        myTextField.setText("Action Listener implemented");
        myLabel.setText("Action Listener implemented as a label");
    }
    public static void main(String args[]) {
        new implementingListener();
    }
}
