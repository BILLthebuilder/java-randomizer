import java.awt.*;
import java.awt.event.*;

public class myCounter extends Frame  implements ActionListener 
{
    /**
     *
     */
    private static final long serialVersionUID = -8295555948706225223L;
    int counter=0;
    Label myLabel;
    Button myButton;
    TextField myTextField;

    myCounter() {
        myLabel = new Label();
        myTextField = new TextField();
        myLabel.setBounds(30, 80, 300, 30);
        myButton = new Button("Add");
        myButton.setBounds(100, 120, 170, 30);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
     
        // myLabel.setText("I'm a label");
        //myTextField.setText("My text");
        myButton.addActionListener(this);
        add(myButton);
        add(myLabel);
        add(myTextField);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // myLabel.setText("The button has been clicked" + " " + counter++ + " " + "times");
       myTextField.setText( "The button has been clicked" + " " + counter++ + " " + "times");
    }
    public static void main(String args[]) {
        new myCounter();
    }
    
}
